package com.devsuperior.dslist.infrastructure.repository;

import com.devsuperior.dslist.domain.model.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
