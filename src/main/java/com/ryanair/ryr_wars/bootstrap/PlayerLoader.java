package com.ryanair.ryr_wars.bootstrap;

import com.ryanair.ryr_wars.domain.Player;
import com.ryanair.ryr_wars.repositories.PlayerRepository;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Log
@Component
public class PlayerLoader implements ApplicationListener<ContextRefreshedEvent> {

    private PlayerRepository playerRepository;

    @Autowired
    public void setPlayerRepository(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public void onApplicationEvent(ContextRefreshedEvent event){
        Player fulano= new Player();

        fulano.setName("David");
        fulano.setSurname("Cuesta");
        fulano.setTyro(true);
        fulano.setCoins(230);

        playerRepository.save(fulano);
        log.info("player saved with id "+fulano.getId());

        Player mengano= new Player();
        mengano.setName("Francisco");
        mengano.setSurname("Cerrudo");
        mengano.setTyro(true);
        mengano.setGuildGuard(true);
        mengano.setSpaceCompanion(true);
        mengano.setTribalLeader(true);
        mengano.setTruthDevourer(true);
        mengano.setCoins(1000);

        playerRepository.save(mengano);
        log.info("player saved with id "+mengano.getId());

    }

}
