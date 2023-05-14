package com.sqa.cinema_sqa_backend.dtos;

import com.sqa.cinema_sqa_backend.entities.User;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class BillDTO {
    private int id;
    private LocalDateTime createdTime;
    private List<TicketDTO> listTickets;
    private User user;
}
