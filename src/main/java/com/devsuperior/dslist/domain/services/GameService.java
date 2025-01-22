package com.devsuperior.dslist.domain.services;

import com.devsuperior.dslist.application.dto.GameMinDTO;
import com.devsuperior.dslist.domain.model.entities.Game;
import com.devsuperior.dslist.infrastructure.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public List<GameMinDTO> findById(long id){
        Optional<Game> result = gameRepository.findById(id);
        return result.map(GameMinDTO::new).map(List::of).orElse(List.of());
    }
}
