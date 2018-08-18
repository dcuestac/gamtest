package com.ryanair.ryr_wars.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Player {

    @Id @GeneratedValue(strategy = GenerationType.AUTO) @Getter
    private Integer id;

    @Version @Getter @Setter
    private Integer version;

    @Getter @Setter
    private Integer coins;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String surname;

    @Getter @Setter
    private Boolean zealot;

    @Getter @Setter
    private Boolean tyro;

    @Getter @Setter
    private Boolean truthDevourer;

    @Getter @Setter
    private Boolean guildGuard;

    @Getter @Setter
    private Boolean spaceCompanion;

    @Getter @Setter
    private Boolean tribalLeader;

    @Getter @Setter
    private String photoUrl;

    @Getter @Setter
    private String email;

    @Getter @Setter
    private String side;

    @Getter @Setter
    private String level;




}
