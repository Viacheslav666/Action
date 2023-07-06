package com.example.action.repository;

import com.example.action.model.Lot;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LotRepository extends CrudRepository<Lot, Integer> {

    @Query(value = "SELECT new com.example.action." +
            "FullInfoLot(e.name, e.price, e.state)" +
            "FROM Lot e " +
            "WHERE id:=id",
            nativeQuery = true)
    List<Lot> getLotById(@Param("id") int id);
}
