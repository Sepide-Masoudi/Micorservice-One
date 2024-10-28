package com.tub.ise.service;

import com.tub.ise.model.dto.CountriesResponse;
import com.tub.ise.model.entity.Countries;

import java.util.Optional;

public interface CountryService {

    CountriesResponse findById(int id);



}
