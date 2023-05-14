package com.sqa.cinema_sqa_backend.services;

import com.sqa.cinema_sqa_backend.dtos.SeatDTO;

import java.util.List;

public interface ISeatService {
    List<SeatDTO> getSeatsByScheduleId(Integer scheduleId);
}
