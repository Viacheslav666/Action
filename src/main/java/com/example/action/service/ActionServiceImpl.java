package com.example.action.service;

import com.example.action.DTO.FullInfoLot;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.action.repository.LotRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Service
public class ActionServiceImpl implements ActionService {
private final LotRepository lotRepository;

@Override
    public List<FullInfoLot> fullInfoLotList(int id) {
        return lotRepository.getLotById(id).stream()
                .map(FullInfoLot::fromLotFullInfo)
                .collect(Collectors.toList());
    }
}
