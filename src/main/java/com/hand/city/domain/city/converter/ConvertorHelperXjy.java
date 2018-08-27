/*
 * Copyright (c) 2018
 * Author : Luoming Xu
 * Project Name : organization-manager
 * File Name : ConvertorHelperXjy.java
 * CreateTime: 2018/08/17 10:35:28
 * LastModifiedDate : 18-8-15 下午12:57
 */

package com.hand.city.domain.city.converter;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertorHelperXjy
{
    public static <T> T convert(T destin, Object source)
    {
        if (source == null) { return null; }

        Class clazz = source.getClass();
        Field[] fieldsSource = getAllFields(clazz);

        clazz = destin.getClass();
        T temp = null;
        try { temp = (T) clazz.newInstance(); }
        catch (Exception e) { e.printStackTrace(); }

        Field[] fieldsDestin = getAllFields(clazz);

        for (Field fieldSource : fieldsSource)
        {
            fieldSource.setAccessible(true);

            try
            {
                for (Field fieldDestin : fieldsDestin)
                {
                    fieldDestin.setAccessible(true);

                    if (fieldDestin.getName().equals(fieldSource.getName()))
                    {
                        fieldDestin.set(temp, fieldSource.get(source));
                        break;
                    }
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        return temp;
    }

    public static <S, T> List<T> convertList(T destin, List<S> source)
    {
        if (source.size() == 0) { return null; }

        List<T> lists = new ArrayList<>();

        for (S item : source)
        {
            lists.add(convert(destin, item));
        }

        return lists;
    }

    /**
     * 获取所有属性
     *
     * @param clazz
     * @return
     */
    private static Field[] getAllFields(Class<?> clazz)
    {
        List<Field> fieldList = new ArrayList<>();

        for (; clazz != Object.class; clazz = clazz.getSuperclass())
        {
            try
            {
                fieldList.addAll(Arrays.asList(clazz.getDeclaredFields()));
            }
            catch (Exception e)
            {
                //这里甚么都不能抛出去。
                //如果这里的异常打印或者往外抛，则就不会进入
            }
        }

        Field[] temp = new Field[fieldList.size()];
        fieldList.toArray(temp);

        return temp;
    }
}
