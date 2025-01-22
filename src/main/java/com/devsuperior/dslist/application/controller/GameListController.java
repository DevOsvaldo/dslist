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

    public GameListController(GameListService gameListService) {
        this.gameListService = gameListService;
    }

    @GetMapping
    public List<GameListDTO> findAll(){
       List<GameListDTO> result = gameListService.findAll();
       return result;
    }

}
