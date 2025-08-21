package com.github.nicolasvpagliari.gamelist.controller;

import com.github.nicolasvpagliari.gamelist.dto.GameDTO;
import com.github.nicolasvpagliari.gamelist.dto.GameMinDTO;
import com.github.nicolasvpagliari.gamelist.entities.Game;
import com.github.nicolasvpagliari.gamelist.service.GameService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> getAll() {
        List<GameMinDTO> dto = gameService.findAll();
        return dto;
    }

    @GetMapping(path = "/{id}")
    public GameDTO getById(@PathVariable Long id) {
        GameDTO dto = gameService.findById(id);
        return dto;
    }
}
