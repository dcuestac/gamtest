package com.ryanair.ryr_wars.services;

import com.ryanair.ryr_wars.domain.Player;
import com.ryanair.ryr_wars.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {

    private PlayerRepository playerRepository;

    @Autowired
    public void setPlayerRepository(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public Iterable<Player> listAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public Player getPlayerById(Integer id) {
        Optional<Player> player = playerRepository.findById(id);
        return player.get();
    }

    @Override
    public void savePlayer(Player player) {
        playerRepository.save(player);
    }

    @Override
    public String getLevelBadge(Player player){
      Integer level = player.getCoins();
      return "";
    }

    @Override
    public void deletePlayer(Integer id) {
        Player player = getPlayerById(id);
        playerRepository.delete(player);
    }
}
