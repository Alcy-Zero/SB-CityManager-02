package com.hand.city.domain.repository;

import com.hand.city.domain.city.entity.CityE;

import java.util.List;

public interface CityRepository {

    List<CityE> queryAll();
}
