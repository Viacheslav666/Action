package com.example.action.service;

import com.example.action.DTO.FullInfoLot;
import com.example.action.model.Bet;
import com.example.action.model.Lot;
import com.example.action.model.Status;

import java.io.IOException;
import java.util.List;

public interface ActionService {
 public FullInfoLot getEmployeeFullLotById(int id);
 public void startLot(int id);
 public void placeABet(int id, String bidderName);
 public void stopLot(int id);
 public Lot createLot(String title, String description, int startPrice, int bidPrice);
 public List<Lot> getLotsByStatusAndPage(Status status, int page);
 public String getFrequentBidder(int id);
 public Bet getFirstBidder(int id);
 public String exportLots() throws IOException;
}
