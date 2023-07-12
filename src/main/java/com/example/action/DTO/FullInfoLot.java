package com.example.action.DTO;


import com.example.action.model.Bet;
import com.example.action.model.Lot;
import com.example.action.model.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullInfoLot {
    private Integer id;
    private Status status;
    private String title;
    private String description;
    private int startPrice;
    private int bidPrice;
    private int currentPrice;
    private Bet lastBid;

    private int getCurrentPriseFromLot(Lot lot) {
        return lot.getStartPrice() + (lot.getBidPrice() * getCountBet(lot));
    }

    private Bet getLastBetFromLot(Lot lot) {
        int count = getCountBet(lot);
        Bet bet = lot.getId_bidder().get(--count);
        return bet;
    }

    private int getCountBet(Lot lot) {
        return lot.getId_bidder().size();
    }

    public static FullInfoLot fromLot(Lot lot) {
        FullInfoLot fullInfoLot = new FullInfoLot();
        fullInfoLot.setId(lot.getId());
        fullInfoLot.setStatus(lot.getStatus());
        fullInfoLot.setTitle(lot.getTitle());
        fullInfoLot.setDescription(lot.getDescription());
        fullInfoLot.setStartPrice(lot.getStartPrice());
        fullInfoLot.setBidPrice(lot.getBidPrice());
        fullInfoLot.setCurrentPrice(fullInfoLot.getCurrentPriseFromLot(lot));
        fullInfoLot.setLastBid(fullInfoLot.getLastBetFromLot(lot));
        return fullInfoLot;
    }

    public Lot toLot(FullInfoLot fullLot) {
        Lot lot = new Lot();
        lot.setId(this.getId());
        lot.setStatus(this.getStatus());
        lot.setTitle(this.getTitle());
        lot.setDescription(this.getDescription());
        lot.setStartPrice(this.getStartPrice());
        lot.setBidPrice(this.getBidPrice());
        return lot;
    }

}
