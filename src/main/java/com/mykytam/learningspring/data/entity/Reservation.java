package com.mykytam.learningspring.data.entity;

import javax.persistence.*;

@Entity // Annotation specifies that the class is an entity and is mapped to a database table.
@Table(name = "RESERVATION") // Annotation specifies the name of the database table to be used for mapping.
public class Reservation {
    @Id // Annotation specifies the primary key of an entity
    @Column(name = "RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO) // Annotation provides for the specification of generation strategies for the values of primary keys.
    private long reservationId;
    @Column(name = "ROOM_ID")
    private String roomId;
    @Column(name = "GUEST_ID")
    private String guestId;
    @Column(name = "RES_DATE")
    private String reservationDate;

    public long getReservationId() {
        return reservationId;
    }

    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }
}
