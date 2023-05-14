package com.sqa.cinema_sqa_backend.services;

import com.sqa.cinema_sqa_backend.dtos.TicketDTO;

import java.util.List;

public interface ITicketService {
    List<TicketDTO> getTicketsByUserId(Integer userId);
}
