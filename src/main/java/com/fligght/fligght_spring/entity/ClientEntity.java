package com.fligght.fligght_spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "client", schema = "fligght")
public class ClientEntity {

    @Id
    @GeneratedValue
    @Column(name = "id_client", nullable = false)
    private int id;

    @Basic
    @Column(name = "nom", nullable = true, length = 45)
    private String nom;

    @Basic
    @Column(name = "numero_passport", nullable = true, length = 45)
    private String numeroPassport;


    public int getId() { return id; }

    public void setId(int idClient) {
        this.id = idClient;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getNumeroPassport() {
        return numeroPassport;
    }

    public void setNumeroPassport(String numeroPassport) {
        this.numeroPassport = numeroPassport;
    }
}
