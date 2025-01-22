package com.devsuperior.dslist.application.controller;

import com.devsuperior.dslist.application.dto.GameDTO;
import com.devsuperior.dslist.application.dto.GameListDTO;
import com.devsuperior.dslist.application.dto.GameMinDTO;
import com.devsuperior.dslist.domain.model.entities.GameList;
import com.devsuperior.dslist.domain.services.GameListService;
import com.devsuperior.dslist.domain.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    private final GameListService gameListService;
    private final GameService gameService;

    public GameListController(GameListService gameListService, GameService gameService) {
        this.gameListService = gameListService;
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameListDTO> findAll(){
       List<GameListDTO> result = gameListService.findAll();
       return result;
    }
    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable long listId){
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

}
