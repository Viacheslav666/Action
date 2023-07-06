package com.example.action.DTO;

import com.example.action.model.Lot;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullInfoLot {

    private String name;
    private int price;

    public FullInfoLot(Lot lot) {

    }

    public static FullInfoLot fromLotFullInfo(Lot lot) {
        FullInfoLot fullInfoLot = new FullInfoLot(lot);
        fullInfoLot.setName(lot.getName());
        fullInfoLot.setPrice(lot.getPrice());
return fullInfoLot;
    }

}
