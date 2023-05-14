package com.sqa.cinema_sqa_backend.services;

import com.sqa.cinema_sqa_backend.dtos.RoomDTO;

import java.util.List;

public interface IRoomService {
    List<RoomDTO> getRooms(Integer movieId, Integer branchId, String startDate, String startTime);
}
