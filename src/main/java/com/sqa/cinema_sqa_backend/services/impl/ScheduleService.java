package com.sqa.cinema_sqa_backend.services.impl;

import com.sqa.cinema_sqa_backend.dtos.ScheduleDTO;
import com.sqa.cinema_sqa_backend.repositories.IScheduleRepository;
import com.sqa.cinema_sqa_backend.services.IScheduleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScheduleService implements IScheduleService {
    @Autowired
    private IScheduleRepository scheduleRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<String> getStartTimes(Integer movieId, Integer branchId, LocalDate startDate) {
        return scheduleRepository.getStartTimeByMovie_IdAndBranch_IdAndStartDate(movieId,startDate)
                .stream().map(localTime -> localTime.format(DateTimeFormatter.ofPattern("HH:mm")))
                .collect(Collectors.toList());
    }

    @Override
    public List<ScheduleDTO> getSchedules(Integer movieId, Integer branchId, String startDate, String startTime,Integer roomId) {
        return scheduleRepository.getSchedulesByMovie_IdAndStartDateAndStartTimeAndRoom_Id(movieId
                        ,LocalDate.parse(startDate),LocalTime.parse(startTime), roomId)
                .stream().map(schedule -> modelMapper.map(schedule, ScheduleDTO.class))
                .collect(Collectors.toList());
    }
}
