package com.tub.ise.controller;

import com.tub.ise.model.dto.CountriesRequest;
import com.tub.ise.model.dto.CountriesResponse;
import com.tub.ise.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@CrossOrigin("*")
@RequestMapping(value = "/countries")
@RestController
public class CountriesController {
    @Autowired
    private CountryService countryService;
    @Autowired
    private RestTemplate restTemplate;

    @Value("${service.cities.url}")
    private String serviceBUrl;


    @PostMapping
    public CountriesResponse getCountriesByName(@RequestBody CountriesRequest request){
        return countryService.findById(request.getId());
    }
    @PostMapping(name = "cities", path = "/cities")
    public List<CountriesResponse> getCities(@RequestBody CountriesRequest request){
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

        HttpEntity<CountriesRequest> requestEntity = new HttpEntity<>(request, headers);

        ResponseEntity<List<CountriesResponse>> responseEntity =restTemplate.exchange(
                serviceBUrl,
                HttpMethod.POST,
                requestEntity,
                new ParameterizedTypeReference<List<CountriesResponse>>() {});
        return responseEntity.getBody();
    }

    @RequestMapping(method=RequestMethod.GET, path = "/healthCheck")
    public String healthCheck(){
        return "This is up and running !";
    }

}
