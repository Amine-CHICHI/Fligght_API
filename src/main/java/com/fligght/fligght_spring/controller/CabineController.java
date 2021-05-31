package com.fligght.fligght_spring.controller;

import com.fligght.fligght_spring.entity.CabineEntity;
import com.fligght.fligght_spring.repository.CabineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v2")
public class CabineController {

    @Autowired
    private CabineRepository cabineRepository;

    @GetMapping("/cabines")
    public List<CabineEntity> getCabines(){
        return cabineRepository.findAll();
    }

//    @GetMapping("/cabines")
//    public String getCabines(){
//        return "salam";
//    }
}
