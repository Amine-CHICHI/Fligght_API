package com.fligght.fligght_spring.repository;

import com.fligght.fligght_spring.entity.AeroportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AeroportRepository extends JpaRepository<AeroportEntity,Long> {
    AeroportEntity findByNomContaining(String airportName);
}
