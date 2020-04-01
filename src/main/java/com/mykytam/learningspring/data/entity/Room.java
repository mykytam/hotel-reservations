package com.mykytam.learningspring.data.entity;

import javax.persistence.*;

@Entity // Annotation specifies that the class is an entity and is mapped to a database table.
@Table(name = "ROOM") // Annotation specifies the name of the database table to be used for mapping.
public class Room {
    @Id // Annotation specifies the primary key of an entity
    @Column(name = "ROOM_ID")
    @GeneratedValue(strategy = GenerationType.AUTO) // Annotation provides for the specification of generation strategies for the values of primary keys.
    private long id;
    @Column(name="NAME")
    private String name;
    @Column(name="ROOM_NUMBER")
    private String number;
    @Column(name="BED_INFO")
    private String bedInfo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBedInfo() {
        return bedInfo;
    }

    public void setBedInfo(String bedInfo) {
        this.bedInfo = bedInfo;
    }
}