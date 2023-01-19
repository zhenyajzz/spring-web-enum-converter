package com.example.springwebenumconverter.controller;

import com.example.springwebenumconverter.entity.Player;
import com.example.springwebenumconverter.repo.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PlayerController {

    @Autowired
    PlayerRepo playerRepo;

    @GetMapping("/players")
    private List<Player> findAllPlayers(){

        return playerRepo.findAll();
    }

    @PostMapping("/post")
    private Player postLevel(@RequestBody Player level){
        System.out.println("++++++++++++" + level);
        return playerRepo.save(level);
        //localhost:8080/api/post
        //JSON ---->
//        {
//    "level1": "MIDDLE",
//    "level2": "HIGH"
//}
    }
}
