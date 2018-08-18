package com.ryanair.ryr_wars.repositories;

import com.ryanair.ryr_wars.domain.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Integer>{
}
