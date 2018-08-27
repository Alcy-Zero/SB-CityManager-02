/*
 * Copyright (c) 2018
 * Author : Luoming Xu
 * Project Name : organization-manager
 * File Name : IamPermissionOrganizationMapper.java
 * CreateTime: 2018/08/17 09:53:02
 * LastModifiedDate : 18-8-17 上午9:50
 */

package com.hand.city.infra.mapper;

import com.hand.city.infra.dataobject.CityDO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CityMapper
{
    List<CityDO> queryAll();
}