package com.mykytam.learningspring.data.entity;

import javax.persistence.*;

@Entity // Annotation specifies that the class is an entity and is mapped to a database table.
@Table(name = "ROOM") // Annotation specifies the name of the database table to be used for mapping.
public class Room {
    @Id // Annotation specifies the primary key of an entity
    @Column(name = "ROOM_ID")
    @GeneratedValue(strategy = GenerationType.AUTO) // Annotation provides for the specification of generation strategies for the values of primary keys.
    private long roomId;
    @Column(name = "NAME")
    private String roomName;
    @Column(name = "ROOM_NUMBER")
    private String roomNumber;
    @Column(name = "BED_INFO")
    private String bedInfo;

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBedInfo() {
        return bedInfo;
    }

    public void setBedInfo(String bedInfo) {
        this.bedInfo = bedInfo;
    }
}
