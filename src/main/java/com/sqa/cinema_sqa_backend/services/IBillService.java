package com.sqa.cinema_sqa_backend.services;

import com.sqa.cinema_sqa_backend.dtos.BookingRequestDTO;

public interface IBillService {
    void createNewBill(BookingRequestDTO bookingRequestDTO) throws RuntimeException;
}
