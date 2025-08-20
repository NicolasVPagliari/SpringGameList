package com.github.nicolasvpagliari.gamelist.repository;

import com.github.nicolasvpagliari.gamelist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
