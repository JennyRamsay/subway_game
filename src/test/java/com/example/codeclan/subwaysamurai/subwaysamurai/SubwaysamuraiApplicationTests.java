package com.example.codeclan.subwaysamurai.subwaysamurai;

import com.example.codeclan.subwaysamurai.subwaysamurai.models.Player;
import com.example.codeclan.subwaysamurai.subwaysamurai.repository.PlayerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@SpringBootTest
public class SubwaysamuraiApplicationTests {

	@Autowired
	PlayerRepository playerRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createPlayer(){
		Player jen = new Player("Jen Jen", 100);
		playerRepository.save(jen);
	}

}
