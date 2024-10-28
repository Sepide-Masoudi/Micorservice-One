package com.tub.ise.model.dto;

import com.tub.ise.model.entity.Countries;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CountriesResponse {

    private String name;


    public static CountriesResponse mapper(Countries countries){
        return new CountriesResponse(countries.getName());
    }
}
