package com.devsuperior.dslist.infrastructure.repository;

import com.devsuperior.dslist.domain.model.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
