package com.fligght.fligght_spring.entity;

import org.springframework.data.domain.Example;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "vol", schema = "fligght", catalog = "")
public class VolEntity {

    private Long id;
    private Date dateDepart;
    private Date dateArrivee;
    private Time heureDepart;
    private Time heureArrivee;
    private BigDecimal price;
    private Integer isreservationavailable;
    private AeroportEntity aeroportDepart;
    private AeroportEntity aeroportArrivee;
    private CabineEntity cabine;


    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long idVol) {
        this.id = idVol;
    }

    @Basic
    @Column(name = "date_depart", nullable = false)
    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    @Basic
    @Column(name = "date_arrivee", nullable = false)
    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    @Basic
    @Column(name = "heure_depart", nullable = false)
    public Time getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(Time heureDepart) {
        this.heureDepart = heureDepart;
    }

    @Basic
    @Column(name = "heure_arrivee", nullable = false)
    public Time getHeureArrivee() {
        return heureArrivee;
    }

    public void setHeureArrivee(Time heureArrivee) {
        this.heureArrivee = heureArrivee;
    }

    @Basic
    @Column(name = "price", nullable = false, precision = 4)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "isreservationavailable", nullable = true)
    public Integer getIsreservationavailable() {
        return isreservationavailable;
    }

    public void setIsreservationavailable(Integer isreservationavailable) {
        this.isreservationavailable = isreservationavailable;
    }
    @ManyToOne
    @JoinColumn(name = "aeroport_depart_id", referencedColumnName = "id_aeroport", nullable = false)
    public AeroportEntity getAeroportDepart() {
        return aeroportDepart;
    }

    public void setAeroportDepart(AeroportEntity AeroportDepart) {
        this.aeroportDepart = AeroportDepart;
    }

    @ManyToOne
    @JoinColumn(name = "aeroport_arrivee_id", referencedColumnName = "id_aeroport", nullable = false)
    public AeroportEntity getAeroportArrivee() {
        return aeroportArrivee;
    }

    public void setAeroportArrivee(AeroportEntity AeroportArrivee) {
        this.aeroportArrivee = AeroportArrivee;
    }

    @ManyToOne
    @JoinColumn(name = "cabine_id", referencedColumnName = "id_cabine",nullable = false)
    public CabineEntity getCabine() {
        return cabine;
    }

    public void setCabine(CabineEntity Cabine) {
        this.cabine = Cabine;
    }


}
