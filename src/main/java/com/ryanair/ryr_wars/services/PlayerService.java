package com.ryanair.ryr_wars.services;

import com.ryanair.ryr_wars.domain.Player;

import java.util.Optional;

public interface PlayerService {
    Iterable<Player> listAllPlayers();

    Player getPlayerById(Integer id);

    void savePlayer(Player player);

    String getLevelBadge(Player player);

    void deletePlayer(Integer id);
}
