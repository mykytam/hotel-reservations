package com.mykytam.learningspring.data.repository;

import com.mykytam.learningspring.data.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    Room findByNumber(String number);
}
