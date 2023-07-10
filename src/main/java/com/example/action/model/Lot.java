package com.example.action.model;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Lot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Status status;
    @Min(3)
    @Max(64)
    private String title;
    @Min(1)
    @Max(4096)
    private String description;
    @Min(1)
    @Column(name = "start_Price")
    private int startPrice;
    @Min(1)
    @Column(name = "bid_Price")
    private int bidPrice;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_bidder")
    private List<Bet> id_bidder;
    private Status getStatus(int statusId) {
        Status status;
        if(statusId == 1){
            status = Status.STARTED;
        }else if(statusId == 2){
            status = Status.STOPPED;
        }else{
            status = Status.CREATED;
        }
        return status;
    }
}
