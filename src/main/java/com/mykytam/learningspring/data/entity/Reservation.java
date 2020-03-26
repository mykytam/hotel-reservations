package com.mykytam.learningspring.data.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity // Annotation specifies that the class is an entity and is mapped to a database table.
@Table(name = "RESERVATION") // Annotation specifies the name of the database table to be used for mapping.
public class Reservation {
    @Id // Annotation specifies the primary key of an entity
    @Column(name = "RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO) // Annotation provides for the specification of generation strategies for the values of primary keys.
    private long id;
    @Column(name="ROOM_ID")
    private long roomId;
    @Column(name="GUEST_ID")
    private long guestId;
    @Column(name="RES_DATE")
    private Date date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
