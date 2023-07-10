package com.example.action.controller;

import com.example.action.DTO.FullInfoLot;

import com.example.action.model.Bet;
import com.example.action.model.Status;
import lombok.RequiredArgsConstructor;
import com.example.action.model.Lot;
import org.springframework.web.bind.annotation.*;
import com.example.action.service.ActionService;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/lot")
@RequiredArgsConstructor
public class ActionController {

    private final ActionService actionService;


    @GetMapping("{id}first")
    public Bet infoFirstPlayer(@PathVariable Integer id) {
        return actionService.getFirstBidder(id);
    }

    @GetMapping("{id}frequent")
    public String namePlayerFrequentLot(@PathVariable Integer id) {
        return actionService.getFrequentBidder(id);
    }

    @GetMapping("{id}")
    public FullInfoLot fullInfoLot(@PathVariable Integer id) {
        return actionService.getEmployeeFullLotById(id);
    }
    @PostMapping("{id}start")
    public void tradeLot(@PathVariable Integer id){
        actionService.startLot(id);

    }
    @PostMapping("{id}bid")
    public void bidLot(@PathVariable Integer id){

    }
    @PostMapping("{id}stop")
    public void stopTradeLot(@PathVariable Integer id){
        actionService.stopLot(id);

    }
    @PostMapping
    public Lot createLot(@RequestParam String title,
                         @RequestParam String description,
                         @RequestParam int startPrice,
                         @RequestParam int bidPrice) {
        return actionService.createLot(title, description, startPrice, bidPrice);
    }
@GetMapping("{}page")
    public List<Lot> fullLots(@RequestParam("status") Status status,
                              @RequestParam("page") int page){
        return actionService.getLotsByStatusAndPage(status, page);
}
    @GetMapping("/export")
    public String exportLots() throws IOException {
        return actionService.exportLots();
    }

}
