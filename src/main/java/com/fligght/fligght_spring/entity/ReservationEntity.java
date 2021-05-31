package com.fligght.fligght_spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "reservation", schema = "fligght", catalog = "")
public class ReservationEntity {
    //    private Long id;
    private int idReservation;
    private String dateReservation;
    private String heureReservation;
    private ClientEntity clientByClientIdClient;
    private VolEntity vol;

    @ManyToOne
    @JoinColumn(name = "id_vol", nullable = false)
    public VolEntity getVol() {
        return vol;
    }

    public void setVol(VolEntity vol) {
        this.vol = vol;
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
    @Column(name = "idReservation", nullable = false)
    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    @Basic
    @Column(name = "dateReservation", nullable = true, length = 45)
    public String getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(String dateReservation) {
        this.dateReservation = dateReservation;
    }

    @Basic
    @Column(name = "heureReservation", nullable = true, length = 45)
    public String getHeureReservation() {
        return heureReservation;
    }

    public void setHeureReservation(String heureReservation) {
        this.heureReservation = heureReservation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReservationEntity that = (ReservationEntity) o;

        if (idReservation != that.idReservation) return false;
        if (dateReservation != null ? !dateReservation.equals(that.dateReservation) : that.dateReservation != null)
            return false;
        if (heureReservation != null ? !heureReservation.equals(that.heureReservation) : that.heureReservation != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idReservation;
        result = 31 * result + (dateReservation != null ? dateReservation.hashCode() : 0);
        result = 31 * result + (heureReservation != null ? heureReservation.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "Client_idClient", referencedColumnName = "idClient", nullable = false)
    public ClientEntity getClientByClientIdClient() {
        return clientByClientIdClient;
    }

    public void setClientByClientIdClient(ClientEntity clientByClientIdClient) {
        this.clientByClientIdClient = clientByClientIdClient;
    }
}
