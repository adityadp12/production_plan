package com.agit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.agit.entity.Schedule;
import com.agit.service.ScheduleService;

import java.util.List;

@CrossOrigin("*")
@RequestMapping(value = "/schedule")
@RestController
public class MainController {

    @Autowired
    private ScheduleService ScheduleService;

    @PostMapping
    public Schedule addSchedule(@RequestBody Schedule schedule){
        return ScheduleService.addSchedule(schedule);
    }
    @GetMapping
    public List<Schedule> fetchSchedule(){
        return  ScheduleService.fetchSchedule();
    }
    @GetMapping("/{id}")
    public Schedule fetchScheduleById(@PathVariable int id){
        return ScheduleService.fetchScheduleById(id);
    }
}
