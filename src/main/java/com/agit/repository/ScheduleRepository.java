package com.agit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agit.entity.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule,Integer> {
}
