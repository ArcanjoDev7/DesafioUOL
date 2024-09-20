package com.miguel.uolhost_backend.service;

import com.miguel.uolhost_backend.infra.CodinameHandler;
import com.miguel.uolhost_backend.model.GroupType;
import com.miguel.uolhost_backend.model.Player;
import com.miguel.uolhost_backend.model.dto.PlayerDTO;
import com.miguel.uolhost_backend.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repository;
    @Autowired
    private CodinameHandler handler;
    public Player createPlayer(PlayerDTO dto){
        Player newPLayer = new Player(dto);
        String codiname = getCodiname(dto.groupType());
        newPLayer.setCodiname(codiname);
        return repository.save(newPLayer);
    }
    private String getCodiname(GroupType groupType){
        return handler.findCodiname(groupType);
    }
    public List<Player> getAllPlayer(){
        return repository.findAll();
    }

}
