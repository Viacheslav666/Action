package com.example.action.controller;

import com.example.action.DTO.FullInfoLot;
import com.example.action.DTO.InfoPlayer;
import lombok.RequiredArgsConstructor;
import com.example.action.model.Lot;
import org.springframework.web.bind.annotation.*;
import com.example.action.service.ActionService;

import java.util.List;

@RestController
@RequestMapping("/lot")
@RequiredArgsConstructor
public class ActionController {

    private final ActionService actionService;


    @GetMapping("{id}first")
    public List<InfoPlayer> infoFirstPlayer(@PathVariable Integer id) {
        return null;
    }

    @GetMapping("{id}frequent")
    public String namePlayerFrequentLot(@PathVariable Integer id) {
        return null;
    }

    @GetMapping("{id}")
    public List<FullInfoLot> fullInfoLot(@PathVariable Integer id) {
        return actionService.fullInfoLotList(id);
    }
    @PostMapping("{id}start")
    public void tradeLot(@PathVariable Integer id){

    }
    @PostMapping("{id}bid")
    public void bidLot(@PathVariable Integer id){

    }
    @PostMapping("{id}stop")
    public void stopTradeLot(@PathVariable Integer id){

    }
    @PostMapping()
    public void createLot(@PathVariable Lot lot){

    }
@GetMapping("{}page")
    public List<Lot> fullLots(@RequestParam("page") int page){
        return null;
}
}
