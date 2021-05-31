package com.fligght.fligght_spring.controller;

import com.fligght.fligght_spring.dto.VolDto;
import com.fligght.fligght_spring.service.VolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v2")
public class VolController {

    @Autowired
    private VolService volService;

    @GetMapping("/vols")
    public List<VolDto> getVols(){
        return volService.findFlights();
    }

    @PostMapping("/vols")
    public List<VolDto> getVolPreference(@RequestBody VolDto volDto){

        return volService.getRelevantFlights(volDto);
    }
}
