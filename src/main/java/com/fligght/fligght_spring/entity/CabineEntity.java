package com.fligght.fligght_spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "cabine", schema = "fligght")
public class CabineEntity {
    //    private Long id;
    @Basic
    @Column(name = "typeCabine", nullable = false, length = 45)
    private String typeCabine;

    @Basic
    @Column(name = "Capacite", nullable = true)
    private Integer capacite;

    @Id
    @GeneratedValue
    @Column(name = "id_cabine", nullable = false)
    private Long id;

//    @Id
//    @GeneratedValue
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }


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


    public Long getIdCabine() {
        return id;
    }

    public void setIdCabine(Long idCabine) {
        this.id = idCabine;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        CabineEntity that = (CabineEntity) o;
//
//        if (idCabine != that.idCabine) return false;
//        if (typeCabine != null ? !typeCabine.equals(that.typeCabine) : that.typeCabine != null) return false;
//        if (capacite != null ? !capacite.equals(that.capacite) : that.capacite != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = typeCabine != null ? typeCabine.hashCode() : 0;
//        result = 31 * result + (capacite != null ? capacite.hashCode() : 0);
//        result = 31 * result + idCabine;
//        return result;
//    }
}
