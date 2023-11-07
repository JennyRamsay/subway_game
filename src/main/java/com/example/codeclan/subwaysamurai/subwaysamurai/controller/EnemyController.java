package com.example.codeclan.subwaysamurai.subwaysamurai.controller;

import com.example.codeclan.subwaysamurai.subwaysamurai.models.Enemy;
import com.example.codeclan.subwaysamurai.subwaysamurai.repository.EnemyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EnemyController {

    @Autowired
    EnemyRepository enemyRepository;

    @GetMapping(value = "/enemies")
    public List<Enemy> getAllEnemies(){
        return enemyRepository.findAll();
    }

    @GetMapping(value = "/enemies/{id}")
    public Optional<Enemy> getEnemy(@PathVariable Long id){
        return Optional.of(enemyRepository.getById(id));
    }
}
