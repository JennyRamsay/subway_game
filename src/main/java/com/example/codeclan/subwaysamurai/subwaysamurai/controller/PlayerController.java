package com.example.codeclan.subwaysamurai.subwaysamurai.controller;

import com.example.codeclan.subwaysamurai.subwaysamurai.models.Player;
import com.example.codeclan.subwaysamurai.subwaysamurai.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PlayerController {

    @Autowired
    PlayerRepository playerRepository;

    @GetMapping(value="/players")
    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }

    @GetMapping(value="/players/{id}")
    public Optional<Player> getPlayer(@PathVariable Long id){
        return playerRepository.findById(id);
    }
}
