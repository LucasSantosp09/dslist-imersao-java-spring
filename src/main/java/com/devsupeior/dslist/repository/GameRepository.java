package com.devsupeior.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsupeior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
