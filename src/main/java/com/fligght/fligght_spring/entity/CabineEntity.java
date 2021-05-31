package com.fligght.fligght_spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "cabine", schema = "fligght")
public class CabineEntity {

    @Id
    @GeneratedValue
    @Column(name = "id_cabine", nullable = false)
    private Long id;

    @Basic
    @Column(name = "type_cabine", nullable = false, length = 45)
    private String typeCabine;

    @Basic
    @Column(name = "Capacite", nullable = true)
    private Integer capacite;




    public String getTypeCabine() {
        return typeCabine;
    }

    public void setTypeCabine(String typeCabine) {
        this.typeCabine = typeCabine;
    }


    public Integer getCapacite() {
        return capacite;
    }

    public void setCapacite(Integer capacite) {
        this.capacite = capacite;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long idCabine) {
        this.id = idCabine;
    }

}
