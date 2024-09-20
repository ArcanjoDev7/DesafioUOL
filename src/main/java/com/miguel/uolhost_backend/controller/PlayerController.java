package com.miguel.uolhost_backend.controller;

import com.miguel.uolhost_backend.infra.CodinameHandler;
import com.miguel.uolhost_backend.model.GroupType;
import com.miguel.uolhost_backend.model.Player;
import com.miguel.uolhost_backend.model.dto.PlayerDTO;
import com.miguel.uolhost_backend.repositories.PlayerRepository;
import com.miguel.uolhost_backend.service.CodinameService;
import com.miguel.uolhost_backend.service.PlayerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService service;

    @PostMapping
    public ResponseEntity<Player> createPLayer(@RequestBody @Valid PlayerDTO dto){
        Player newPlayer = service.createPlayer(dto);
        return new ResponseEntity<>(newPlayer, HttpStatus.CREATED);
    }
    @GetMapping
    private ResponseEntity<List<Player>> getAllPlayers(GroupType groupType){
        return new ResponseEntity<>(service.getAllPlayer(),HttpStatus.OK);
    }
}
