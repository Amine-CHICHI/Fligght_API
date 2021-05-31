package com.fligght.fligght_spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "ville", schema = "fligght", catalog = "")
public class VilleEntity {
    //    private Long id;
    private String nom;
    private int idVille;
    private PaysEntity paysByPaysIdpays;

//    @Id
//    @GeneratedValue
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    @Basic
    @Column(name = "nom", nullable = true, length = 45)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Id
    @GeneratedValue
    @Column(name = "idVille", nullable = false)
    public int getIdVille() {
        return idVille;
    }

    public void setIdVille(int idVille) {
        this.idVille = idVille;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VilleEntity that = (VilleEntity) o;

        if (idVille != that.idVille) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nom != null ? nom.hashCode() : 0;
        result = 31 * result + idVille;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "Pays_idpays", referencedColumnName = "idpays", nullable = false)
    public PaysEntity getPaysByPaysIdpays() {
        return paysByPaysIdpays;
    }

    public void setPaysByPaysIdpays(PaysEntity paysByPaysIdpays) {
        this.paysByPaysIdpays = paysByPaysIdpays;
    }
}
