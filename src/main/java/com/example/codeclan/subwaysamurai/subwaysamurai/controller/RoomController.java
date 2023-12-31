package com.example.codeclan.subwaysamurai.subwaysamurai.controller;

import com.example.codeclan.subwaysamurai.subwaysamurai.models.Player;
import com.example.codeclan.subwaysamurai.subwaysamurai.models.Room;
import com.example.codeclan.subwaysamurai.subwaysamurai.repository.PlayerRepository;
import com.example.codeclan.subwaysamurai.subwaysamurai.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class RoomController {

    @Autowired
    RoomRepository roomRepository;

    @GetMapping(value="/rooms")
    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }

    @GetMapping(value="/rooms/{id}")
    public Optional<Room> getRoom(@PathVariable Long id){
        return roomRepository.findById(id);
    }
}
