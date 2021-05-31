package com.fligght.fligght_spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "aeroport", schema = "fligght")
public class AeroportEntity {

    @Id
    @GeneratedValue
    @Column(name = "id_Aeroport", nullable = false)
    private Long id;

    @Basic
    @Column(name = "nom", nullable = true, length = 45)
    private String nom;

    @ManyToOne
    @JoinColumn(name = "id_ville", nullable = false)
    private VilleEntity ville;


    public VilleEntity getVille() {
        return ville;
    }

    public void setVille(VilleEntity ville) {
        this.ville = ville;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}
