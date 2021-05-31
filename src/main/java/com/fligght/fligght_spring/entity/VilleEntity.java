package com.fligght.fligght_spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "ville", schema = "fligght")
public class VilleEntity {

    @Basic
    @Column(name = "nom", nullable = true, length = 45)
    private String nom;
    @Id
    @GeneratedValue
    @Column(name = "id_ville", nullable = false)
    private int idVille;
    @ManyToOne
    @JoinColumn(name = "pays_id", referencedColumnName = "idpays", nullable = false)
    private PaysEntity pays;


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public int getIdVille() {
        return idVille;
    }

    public void setIdVille(int idVille) {
        this.idVille = idVille;
    }


    public PaysEntity getPaysByPaysIdpays() {
        return pays;
    }

    public void setPaysByPaysIdpays(PaysEntity paysByPaysIdpays) {
        this.pays = paysByPaysIdpays;
    }
}
