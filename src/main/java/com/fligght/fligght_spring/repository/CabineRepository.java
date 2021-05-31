package com.fligght.fligght_spring.repository;

import com.fligght.fligght_spring.entity.CabineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabineRepository extends JpaRepository<CabineEntity, Long> {
    CabineEntity findByTypeCabineContaining(String cabineName);
}
