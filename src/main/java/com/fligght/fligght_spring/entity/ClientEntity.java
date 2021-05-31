package com.fligght.fligght_spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "client", schema = "fligght", catalog = "")
public class ClientEntity {
    //    private Long id;
    private int idClient;
    private String nom;
    private String numeroPassport;

//    @Id
//    @GeneratedValue
//    public Long getId() {
//        return id;
//    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    @Id
    @GeneratedValue
    @Column(name = "idClient", nullable = false)
    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    @Basic
    @Column(name = "nom", nullable = true, length = 45)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "numeroPassport", nullable = true, length = 45)
    public String getNumeroPassport() {
        return numeroPassport;
    }

    public void setNumeroPassport(String numeroPassport) {
        this.numeroPassport = numeroPassport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientEntity that = (ClientEntity) o;

        if (idClient != that.idClient) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;
        if (numeroPassport != null ? !numeroPassport.equals(that.numeroPassport) : that.numeroPassport != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idClient;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (numeroPassport != null ? numeroPassport.hashCode() : 0);
        return result;
    }
}
