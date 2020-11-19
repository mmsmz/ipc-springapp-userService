package com.ipc.userservice.user.repository;

import com.ipc.userservice.user.entity.CoursePriceEntity;
import com.ipc.userservice.user.entity.CourseScheduleEntity;
import com.ipc.userservice.user.entity.StudentPurchaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseRepository extends JpaRepository<StudentPurchaseEntity, Long> {

    List<StudentPurchaseEntity> findByUserId(Integer userId);
    List<CoursePriceEntity> findByCoursePriceId(Integer coursePriceId);
    List<CourseScheduleEntity> findByCourseScheduleId(Integer courseScheduleId);

}

