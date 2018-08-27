package com.hand.city.domain.city.converter;

import com.hand.city.api.dto.CityDTO;
import com.hand.city.domain.city.entity.CityE;
import com.hand.city.infra.dataobject.CityDO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CityConverter {

    public CityE dtoToEntity(CityDTO dto) {
        CityE cityE = new CityE();
        BeanUtils.copyProperties(dto,cityE);
        return cityE;
    }

    public CityDTO entityToDto(CityE entity) {
        CityDTO cityDTO = new CityDTO();
        BeanUtils.copyProperties(entity,cityDTO);
        return cityDTO;
    }

    public CityE doToEntity(CityDO dataObject) {
        CityE cityE = new CityE();
        BeanUtils.copyProperties(dataObject,cityE);
        return cityE;
    }

    public CityDO entityToDo(CityE entity) {
        CityDO cityDO = new CityDO();
        BeanUtils.copyProperties(entity,cityDO);
        return cityDO;
    }
}
