package com.fligght.fligght_spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "aeroport", schema = "fligght", catalog = "")
public class AeroportEntity {
    //    private Long id;
    private Long idAeroport;
    private String nom;

    private VilleEntity ville;

    @ManyToOne
    @JoinColumn(name = "id_ville", nullable = false)
    public VilleEntity getVille() {
        return ville;
    }

    public void setVille(VilleEntity ville) {
        this.ville = ville;
    }


//    @Id
//    @GeneratedValue
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    @Id
    @GeneratedValue
    @Column(name = "idAeroport", nullable = false)
    public Long getIdAeroport() {
        return idAeroport;
    }

    public void setIdAeroport(Long idAeroport) {
        this.idAeroport = idAeroport;
    }

    @Basic
    @Column(name = "nom", nullable = true, length = 45)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}
