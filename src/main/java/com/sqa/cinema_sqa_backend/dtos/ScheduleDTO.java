package com.sqa.cinema_sqa_backend.dtos;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
public class ScheduleDTO {
    private int id;
    private LocalDate startDate;
    private LocalTime startTime;
    private RoomDTO room;
    private MovieDTO movie;
    private Double price;
}
