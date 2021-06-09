package com.fligght.fligght_spring.controller;

import com.fligght.fligght_spring.dto.AeroportDto;
import com.fligght.fligght_spring.service.AeroportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v2")
public class AeroportController {

    @Autowired
    private AeroportService aeroportService;

    @GetMapping("/airports")
    public List<AeroportDto> getAirports() {
        return aeroportService.getAeroports();
    }
}
