package com.ipc.userservice.Repository;

import com.ipc.userservice.UserService.Entity.CoursePriceEntity;
import com.ipc.userservice.UserService.Entity.CourseScheduleEntity;
import com.ipc.userservice.UserService.Entity.StudentPurchaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseRepository extends JpaRepository<StudentPurchaseEntity, Long> {

    List<StudentPurchaseEntity> findByUserId(Integer userId);
    List<CoursePriceEntity> findByCoursePriceId(Integer coursePriceId);
    List<CourseScheduleEntity> findByCourseScheduleId(Integer courseScheduleId);

}

