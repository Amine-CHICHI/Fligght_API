package com.fligght.fligght_spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "pays", schema = "fligght", catalog = "")
public class PaysEntity {
    //    private Long id;
    private String nom;
    private int idpays;

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
    @Column(name = "idpays", nullable = false)
    public int getIdpays() {
        return idpays;
    }

    public void setIdpays(int idpays) {
        this.idpays = idpays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaysEntity that = (PaysEntity) o;

        if (idpays != that.idpays) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nom != null ? nom.hashCode() : 0;
        result = 31 * result + idpays;
        return result;
    }
}
