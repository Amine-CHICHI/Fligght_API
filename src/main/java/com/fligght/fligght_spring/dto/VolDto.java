package com.fligght.fligght_spring.dto;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

public class VolDto {
    private Date dateDepart;
    private Date dateArrivee;
    private Time heureDepart;
    private Time heureArrivee;
    private BigDecimal price;
    private String aeroportArriveName;
    private String aeroportDepartName;
    private String cabineType;

    public VolDto() {
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public Time getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(Time heureDepart) {
        this.heureDepart = heureDepart;
    }

    public Time getHeureArrivee() {
        return heureArrivee;
    }

    public void setHeureArrivee(Time heureArrivee) {
        this.heureArrivee = heureArrivee;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getAeroportArriveName() {
        return aeroportArriveName;
    }

    public void setAeroportArriveName(String aeroportArriveName) {
        this.aeroportArriveName = aeroportArriveName;
    }

    public String getAeroportDepartName() {
        return aeroportDepartName;
    }

    public void setAeroportDepartName(String aeroportDepartName) {
        this.aeroportDepartName = aeroportDepartName;
    }

    public String getCabineType() {
        return cabineType;
    }

    public void setCabineType(String cabineType) {
        this.cabineType = cabineType;
    }
}
