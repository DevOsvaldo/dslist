package com.devsuperior.dslist.domain.services;

import com.devsuperior.dslist.application.dto.GameDTO;
import com.devsuperior.dslist.application.dto.GameMinDTO;
import com.devsuperior.dslist.domain.model.entities.Game;
import com.devsuperior.dslist.infrastructure.repository.GameRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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
    @Transactional()
    public GameDTO findById(@PathVariable  long listId) throws Exception{
        try {
            Game result = gameRepository.findById(listId).get();
            return new GameDTO(result);
        }catch (Exception e){
            throw   new Exception("Id não encontrado ou não existe");
        }
    }
}
