package com.fligght.fligght_spring.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "vol", schema = "fligght", catalog = "")
public class VolEntity {
    //    private Long id;
    private Long idVol;
    private Date dateDepart;
    private Date dateArrivee;
    private Time heureDepart;
    private Time heureArrivee;
    private BigDecimal price;
    private Integer isreservationavailable;
    private AeroportEntity aeroportDepart;
    private AeroportEntity aeroportArrivee;
    private CabineEntity cabine;

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
    public Long getIdVol() {
        return idVol;
    }

    public void setIdVol(Long idVol) {
        this.idVol = idVol;
    }

    @Basic
    @Column(name = "dateDepart", nullable = false)
    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    @Basic
    @Column(name = "dateArrivee", nullable = false)
    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    @Basic
    @Column(name = "heureDepart", nullable = false)
    public Time getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(Time heureDepart) {
        this.heureDepart = heureDepart;
    }

    @Basic
    @Column(name = "heureArrivee", nullable = false)
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
    @JoinColumn(name = "Aeroport_idAeroportDepart", referencedColumnName = "idAeroport", nullable = false)
    public AeroportEntity getAeroportDepart() {
        return aeroportDepart;
    }

    public void setAeroportDepart(AeroportEntity aeroportByAeroportIdAeroportDepart) {
        this.aeroportDepart = aeroportByAeroportIdAeroportDepart;
    }

    @ManyToOne
    @JoinColumn(name = "Aeroport_idAeroportArrivee", referencedColumnName = "idAeroport", nullable = false)
    public AeroportEntity getAeroportArrivee() {
        return aeroportArrivee;
    }

    public void setAeroportArrivee(AeroportEntity aeroportByAeroportIdAeroportArrivee) {
        this.aeroportArrivee = aeroportByAeroportIdAeroportArrivee;
    }

    @ManyToOne
    @JoinColumn(name = "Cabine_idCabine", nullable = false)
    public CabineEntity getCabineByCabineIdCabine() {
        return cabine;
    }

    public void setCabineByCabineIdCabine(CabineEntity cabineByCabineIdCabine) {
        this.cabine = cabineByCabineIdCabine;
    }
}
