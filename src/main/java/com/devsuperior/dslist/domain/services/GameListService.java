package com.devsuperior.dslist.domain.services;

import com.devsuperior.dslist.application.dto.GameListDTO;
import com.devsuperior.dslist.application.dto.GameMinDTO;
import com.devsuperior.dslist.domain.model.entities.Game;
import com.devsuperior.dslist.domain.model.entities.GameList;
import com.devsuperior.dslist.infrastructure.repository.GameListRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GameListService {

    private final GameListRepository gameListRepository;
    public GameListService(GameListRepository gameListRepository) {
        this.gameListRepository = gameListRepository;
    }

    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
