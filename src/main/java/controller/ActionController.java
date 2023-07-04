package controller;

import DTO.FullInfoLot;
import DTO.infoPlayer;
import lombok.RequiredArgsConstructor;
import model.Lot;
import org.springframework.web.bind.annotation.*;
import service.ActionService;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/lot")
@RequiredArgsConstructor
public class ActionController {

    private final ActionService actionService;

    @GetMapping("{id}first")
    public List<infoPlayer> infoFirstPlayer(@PathVariable Integer id) {
        return null;
    }

    @GetMapping("{id}frequent")
    public String namePlayerFrequentLot(@PathVariable Integer id) {
        return null;
    }

    @GetMapping("{id}")
    public List<FullInfoLot> fullInfoLot(@PathVariable Integer id) {
        return null;
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
