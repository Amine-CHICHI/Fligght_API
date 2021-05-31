package com.fligght.fligght_spring.repository;


import com.fligght.fligght_spring.entity.VolEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface VolRepository extends JpaRepository<VolEntity, Long> {
    List<VolEntity> findByAeroportDepart_IdAndAeroportArrivee_Id(Long id_depart, Long id_arrive);

}
