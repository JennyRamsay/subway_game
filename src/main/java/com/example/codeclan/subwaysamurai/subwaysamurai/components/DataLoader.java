package com.example.codeclan.subwaysamurai.subwaysamurai.components;

import com.example.codeclan.subwaysamurai.subwaysamurai.models.Enemy;
import com.example.codeclan.subwaysamurai.subwaysamurai.models.Player;
import com.example.codeclan.subwaysamurai.subwaysamurai.models.Room;
import com.example.codeclan.subwaysamurai.subwaysamurai.repository.EnemyRepository;
import com.example.codeclan.subwaysamurai.subwaysamurai.repository.PlayerRepository;
import com.example.codeclan.subwaysamurai.subwaysamurai.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    EnemyRepository enemyRepository;

    @Autowired
    RoomRepository roomRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        Player player = new Player("Jennifer - The boss", 100);
        playerRepository.save(player);

        Enemy enemy = new Enemy("Big Boss", 10);
        enemyRepository.save(enemy);

        Room room = new Room("help", "dungeon", "Jen");
        roomRepository.save(room);


    }
}
