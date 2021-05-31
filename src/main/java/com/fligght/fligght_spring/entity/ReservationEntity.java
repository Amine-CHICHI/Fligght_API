package com.fligght.fligght_spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "reservation", schema = "fligght")
public class ReservationEntity {

    @Id
    @GeneratedValue
    @Column(name = "id_reservation", nullable = false)
    private int id;

    @Basic
    @Column(name = "date_reservation", nullable = true, length = 45)
    private String dateReservation;

    @Basic
    @Column(name = "heure_reservation", nullable = true, length = 45)
    private String heureReservation;

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id_client", nullable = false)
    private ClientEntity client;

    @ManyToOne
    @JoinColumn(name = "vol_id", nullable = false)
    private VolEntity vol;


    public VolEntity getVol() {
        return vol;
    }

    public void setVol(VolEntity vol) {
        this.vol = vol;
    }


    public int getId() {
        return id;
    }

    public void setId(int idReservation) {
        this.id = idReservation;
    }


    public String getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(String dateReservation) {
        this.dateReservation = dateReservation;
    }


    public String getHeureReservation() {
        return heureReservation;
    }

    public void setHeureReservation(String heureReservation) {
        this.heureReservation = heureReservation;
    }


    public ClientEntity getClientByClientIdClient() {
        return client;
    }

    public void setClientByClientIdClient(ClientEntity clientByClientIdClient) {
        this.client = clientByClientIdClient;
    }
}
