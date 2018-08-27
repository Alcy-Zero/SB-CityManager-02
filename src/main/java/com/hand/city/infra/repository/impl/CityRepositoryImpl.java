/*
 * Copyright (c) 2018
 * Author : Luoming Xu
 * Project Name : organization-manager
 * File Name : IamPermissionOrganizationRepository.java
 * CreateTime: 2018/08/17 10:40:24
 * LastModifiedDate : 18-8-17 上午10:40
 */

package com.hand.city.infra.repository.impl;

import com.hand.city.domain.city.converter.ConvertorHelperXjy;
import com.hand.city.domain.city.entity.CityE;
import com.hand.city.domain.repository.CityRepository;
import com.hand.city.infra.dataobject.CityDO;
import com.hand.city.infra.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class CityRepositoryImpl implements CityRepository
{
    @Autowired
    private CityMapper cityMapper;

    private List<CityE> toEntityList(List<CityDO> list)
    {
        return ConvertorHelperXjy.convertList(new CityE(), list);
    }

    @Override
    public List<CityE> queryAll()
    {
        return toEntityList(cityMapper.queryAll());
    }

}