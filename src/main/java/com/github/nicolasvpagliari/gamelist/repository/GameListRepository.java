package com.github.nicolasvpagliari.gamelist.repository;

import com.github.nicolasvpagliari.gamelist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
