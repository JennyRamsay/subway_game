package com.example.codeclan.subwaysamurai.subwaysamurai.models;

import javax.persistence.*;

@Entity
@Table(name="enemies")
public class Enemy {

    @Column(name = "names")
    private String name;
    @Column(name = "health")
    private int health;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    public Enemy(String name, int health){
        this.name = name;
        this.health = health;
    }

    public Enemy(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
