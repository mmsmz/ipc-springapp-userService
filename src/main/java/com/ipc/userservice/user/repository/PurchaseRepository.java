package com.ipc.userservice.user.repository;
import com.ipc.userservice.user.entity.StudentPurchaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseRepository extends JpaRepository<StudentPurchaseEntity, String> {

	List<StudentPurchaseEntity> findByUserId(String userId);
	// List<CoursePriceEntity> findByCoursePriceId(String coursePriceId);
	// List<CourseScheduleEntity> findByCourseScheduleId(String courseScheduleId);

	List<StudentPurchaseEntity> findByUserIdAndCoursePriceIdAndCourseScheduleIdAndApprovalStatusId(String userId,
			String coursePriceId, String courseScheduleId, String approvalStatusId);

	List<StudentPurchaseEntity> findByUserIdAndApprovalStatusIdNotNull(String userId);

}
