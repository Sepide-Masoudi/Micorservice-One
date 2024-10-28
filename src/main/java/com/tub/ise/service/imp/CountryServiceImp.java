package com.tub.ise.service.imp;

import com.tub.ise.model.dto.CountriesResponse;
import com.tub.ise.model.entity.Countries;
import com.tub.ise.service.CountryService;
import com.tub.ise.service.repository.CountriesRepository;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryServiceImp implements CountryService {
    @Autowired
    private CountriesRepository countriesRepository;
    @Override
    public CountriesResponse findById(int id) {

        Optional<Countries> countries = countriesRepository.findById(id);
        if(countries.isPresent())
            return CountriesResponse.mapper(countries.get());
        else
            return new CountriesResponse("");
    }
}
