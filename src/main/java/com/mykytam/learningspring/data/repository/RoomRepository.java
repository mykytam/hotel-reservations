package com.mykytam.learningspring.data.repository;

import com.mykytam.learningspring.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> { //  CrudRepository<> - interface for generic CRUD operations on a repository for a specific type
}
