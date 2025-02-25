package com.devsuperior.dslist.application.controller;

import com.devsuperior.dslist.application.dto.GameDTO;
import com.devsuperior.dslist.application.dto.GameMinDTO;
import com.devsuperior.dslist.domain.model.entities.Game;
import com.devsuperior.dslist.domain.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameMinDTO> findAll(){
       List<GameMinDTO> result = gameService.findAll();
       return result;
    }
    @GetMapping(value = "/{id}")
    public GameDTO getById(@PathVariable long id) throws Exception {
        GameDTO result = gameService.findById(id);
        return result;
    }
}
