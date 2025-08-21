package com.github.nicolasvpagliari.gamelist.controller;

import com.github.nicolasvpagliari.gamelist.dto.GameListDTO;
import com.github.nicolasvpagliari.gamelist.dto.GameMinDTO;
import com.github.nicolasvpagliari.gamelist.entities.GameList;
import com.github.nicolasvpagliari.gamelist.service.GameListService;
import com.github.nicolasvpagliari.gamelist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> getAll() {
        List<GameListDTO> dto = gameListService.findAll();
        return dto;
    }

    @GetMapping(path = "/{listId}/games")
    public List<GameMinDTO> getByList(@PathVariable Long listId) {
        List<GameMinDTO> dto = gameService.findByList(listId);
        return dto;
    }
}
