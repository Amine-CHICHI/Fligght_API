package com.fligght.fligght_spring.service;

import com.fligght.fligght_spring.dto.VolDto;

import java.util.List;

public interface VolService {
    List<VolDto> findFlights();
    List<VolDto> getRelevantFlights(VolDto volDto);
}
