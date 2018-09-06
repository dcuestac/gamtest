package com.ryanair.ryr_wars.controllers;

import com.ryanair.ryr_wars.domain.Player;
import com.ryanair.ryr_wars.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PlayerController {

    private PlayerService playerService;

    @Autowired
    public void setPlayerService(PlayerService playerService) {
        this.playerService = playerService;
    }

    @RequestMapping(value = "/players", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("players",playerService.listAllPlayers());
        return "players";
    }


    @RequestMapping("player/{id}")
    public String showPlayer(@PathVariable Integer id, Model model){
        model.addAttribute("player",playerService.getPlayerById(id));
        return "playershow";
    }

    @RequestMapping("player/new")
    public String newPlayer(Model model){
        model.addAttribute("player", new Player());
        return "playerform";
    }

    @RequestMapping(value = "player", method = RequestMethod.POST)
    public String savePlayer(Player player){
        playerService.savePlayer(player);
        return "redirect:/player/" + player.getId();
    }
}
