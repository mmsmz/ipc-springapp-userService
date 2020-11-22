package com.ipc.userservice.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ipc.userservice.user.entity.CourseScheduleEntity;


public interface CourseScheduleRepository extends JpaRepository<CourseScheduleEntity, String> {
	List<CourseScheduleEntity> findByCrsprid(String userId);
}