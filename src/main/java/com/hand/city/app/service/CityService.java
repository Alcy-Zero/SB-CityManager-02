package com.hand.city.app.service;

import com.hand.city.api.dto.CityDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CityService {

    List<CityDTO> queryAll();

}
