package com.fligght.fligght_spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "pays", schema = "fligght")
public class PaysEntity {

    @Id
    @GeneratedValue
    @Column(name = "idpays", nullable = false)
    private int id;

    @Basic
    @Column(name = "nom", nullable = true, length = 45)
    private String nom;


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int idpays) {
        this.id = idpays;
    }


}
