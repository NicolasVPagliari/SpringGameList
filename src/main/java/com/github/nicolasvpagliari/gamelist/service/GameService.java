package com.github.nicolasvpagliari.gamelist.service;

import com.github.nicolasvpagliari.gamelist.dto.GameDTO;
import com.github.nicolasvpagliari.gamelist.dto.GameMinDTO;
import com.github.nicolasvpagliari.gamelist.entities.Game;
import com.github.nicolasvpagliari.gamelist.projections.GameMinProjection;
import com.github.nicolasvpagliari.gamelist.repository.GameListRepository;
import com.github.nicolasvpagliari.gamelist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
