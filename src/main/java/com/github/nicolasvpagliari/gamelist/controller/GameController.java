package com.github.nicolasvpagliari.gamelist.controller;

import com.github.nicolasvpagliari.gamelist.dto.GameMinDTO;
import com.github.nicolasvpagliari.gamelist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
