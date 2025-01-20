package com.devsuperior.dslist.domain.services;

import com.devsuperior.dslist.application.dto.GameMinDTO;
import com.devsuperior.dslist.domain.model.entities.Game;
import com.devsuperior.dslist.infrastructure.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private final GameRepository gameRepository;
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();

        return result.stream().map(GameMinDTO::new).toList();
    }
}
