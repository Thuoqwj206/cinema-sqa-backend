package com.sqa.cinema_sqa_backend.repositories;

import com.sqa.cinema_sqa_backend.entities.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ISeatRepository extends JpaRepository<Seat,Integer> {
    List<Seat> getSeatByRoom_Id(Integer roomId);
}
