package com.hand.city.app.service.impl;

import com.hand.city.api.dto.CityDTO;
import com.hand.city.app.service.CityService;
import com.hand.city.domain.city.converter.ConvertorHelperXjy;
import com.hand.city.domain.city.entity.CityE;
import com.hand.city.domain.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    private List<CityDTO> toDTOList(List<CityE> list)
    {
        return ConvertorHelperXjy.convertList(new CityDTO(), list);
    }

    @Override
    public List<CityDTO> queryAll()
    {
        return toDTOList(cityRepository.queryAll());
    }


}
