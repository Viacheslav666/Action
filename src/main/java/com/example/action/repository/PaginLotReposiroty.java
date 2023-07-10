package com.example.action.repository;

import com.example.action.model.Lot;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PaginLotReposiroty extends PagingAndSortingRepository<Lot, Integer> {
}
