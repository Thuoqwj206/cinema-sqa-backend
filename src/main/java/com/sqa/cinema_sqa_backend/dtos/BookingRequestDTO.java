package com.sqa.cinema_sqa_backend.dtos;

import lombok.Data;

import java.util.List;
@Data
public class BookingRequestDTO {
    private Integer userId;
    private Integer scheduleId;
    private List<Integer> listSeatIds;
}
