package com.agit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agit.entity.Schedule;
import com.agit.repository.ScheduleRepository;

import java.util.List;
@Service
public class ScheduleService {
    @Autowired
    private ScheduleRepository ScheduleRepository;

    public Schedule addSchedule(Schedule school){
        return ScheduleRepository.save(school);
    }
    public List<Schedule> fetchSchedule(){
        return ScheduleRepository.findAll();
    }
    public Schedule fetchScheduleById(int id){
        return ScheduleRepository.findById(id).orElse(null);
    }
}
