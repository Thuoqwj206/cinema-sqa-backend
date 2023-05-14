package com.sqa.cinema_sqa_backend.repositories;

import com.sqa.cinema_sqa_backend.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBillRepository extends JpaRepository<Bill, Integer> {
}
