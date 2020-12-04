package com.ipc.userservice.user.service.serviceImpl;

import com.ipc.userservice.user.dto.*;
import com.ipc.userservice.user.entity.ApprovalStatus;
import com.ipc.userservice.user.entity.CoursePriceEntity;
import com.ipc.userservice.user.entity.CourseScheduleEntity;
import com.ipc.userservice.user.repository.ApprovalStatusRepository;
import com.ipc.userservice.user.repository.CoursePriceRepository;
import com.ipc.userservice.user.repository.CourseScheduleRepository;
import com.ipc.userservice.user.repository.PurchaseRepository;
import com.ipc.userservice.user.controller.PurchaseController;
import com.ipc.userservice.user.entity.StudentPurchaseEntity;
import com.ipc.userservice.user.service.PurchaseService;
import com.ipc.userservice.user.util.CommonConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
//@EnableJpaRepositories("com.ipc.userservice.user.Repository")
public class PurchaseServiceImpl implements PurchaseService {

	/**
	 * The Logger
	 */
	final Logger logger = LoggerFactory.getLogger(PurchaseController.class);

	@Autowired
	PurchaseRepository purchaseRepository;

	@Autowired
	CoursePriceRepository coursePriceRepository;

	@Autowired
	CourseScheduleRepository courseScheduleRepository;

	@Autowired
	ApprovalStatusRepository approvalStatusRepository;

	/* To Add Course Details To Summary */
	@Override
	public String addCourseToPurchaseSummary(String userId, PurchaseCartDto purchaseCartDto) {
		try {
			StudentPurchaseEntity studentPurEntity = new StudentPurchaseEntity();
			studentPurEntity.setUserId(userId);
			studentPurEntity.setCoursePriceId(purchaseCartDto.getCoursePriceId());
			studentPurEntity.setCourseScheduleId(purchaseCartDto.getCourseScheduleId());
			purchaseRepository.save(studentPurEntity);
			return CommonConstant.SUCCESSFULLY;
		} catch (Exception e) {
			logger.info(e.getMessage());
			return e.getMessage();
		}
	}

	@Override
	public List<Subjects> getAddedCourseDetailsToSummary(String userId) {
		List<Subjects> subjectsList = new ArrayList<>();
		try {

			logger.info("Inside the Get Added Course Details To Summary method Start");

			List<StudentPurchaseEntity> studentPurchaseEntitylist = purchaseRepository.findByUserId(userId);
			Purchase: for (StudentPurchaseEntity student : studentPurchaseEntitylist) {
				Optional<CoursePriceEntity> temp = coursePriceRepository.findById(student.getCoursePriceId());
				CoursePriceEntity cpEntity = temp.get();
				Optional<CourseScheduleEntity> temp2 = courseScheduleRepository.findById(student.getCourseScheduleId());
				CourseScheduleEntity courseScheduleEntity = temp2.get();

				for (Subjects subjects : subjectsList) {
					if (subjects.getSubjectName().equals(cpEntity.getSubjectName())) {
						ArrayList<CourseSchedule> shedule = new ArrayList<>();

						subjects.getSubjectCategories().add(new SubjectCategory(cpEntity.getCoursePriceId(),
								cpEntity.getSubjectCategory(), cpEntity.getPrice(), shedule));

						shedule.add(new CourseSchedule(courseScheduleEntity.getCourseScheduleId(),
								courseScheduleEntity.getDay() + " " + courseScheduleEntity.getTime()));
						continue Purchase;
					}
				}
				subjectsList.add(new Subjects(cpEntity.getSubjectName(), new ArrayList<>()));
				subjectsList.get(subjectsList.size() - 1).getSubjectCategories()
						.add(new SubjectCategory(cpEntity.getCoursePriceId(), cpEntity.getSubjectCategory(),
								cpEntity.getPrice(), new ArrayList<>()));
				subjectsList.get(subjectsList.size() - 1).getSubjectCategories().get(0).getSchedule()
						.add(new CourseSchedule(courseScheduleEntity.getCourseScheduleId(),
								courseScheduleEntity.getDay() + courseScheduleEntity.getTime()));
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return subjectsList;

	}

	/* To Remove Course Records From Summary */
	@Override
	public String removeCourseRecordsFromSummary(String userId, PurchaseCartDto purchaseCartDto) {
		try {

		} catch (Exception e) {
			logger.info(e.getMessage());
			return e.getMessage();
		}
		return null;
	}

	/* To allow Student to confirm the purchase details */
	@Override
	public String confirmPurchase(String userId,ApprovalStatusDto approvalStatusDto) {
		ApprovalStatus approvalStatus = new ApprovalStatus();
		approvalStatus.setAmountDeposited(approvalStatusDto.getAmountDeposited());
		approvalStatus.setApprovalStatus(approvalStatusDto.getApprovalStatus());
		approvalStatus.setApprovalStatusId(approvalStatusDto.getApprovalStatusId());
		approvalStatus.setComments(approvalStatusDto.getComments());
		// approvalStatus.setDate();
		approvalStatus.setDepositedBank(approvalStatusDto.getDepositedBank());
		approvalStatus.setPaymentType(approvalStatusDto.getPaymentType());
		approvalStatus.setReceiptImageLocation(approvalStatusDto.getReceiptImgLocation());
		approvalStatus.setStudentPurchaseID(approvalStatusDto.getStudentPurchaseId());
		approvalStatusRepository.save(approvalStatus);
		List<StudentPurchaseEntity> studentPurchaseEntitylist=purchaseRepository.findByUserId(userId);
		for(StudentPurchaseEntity student:studentPurchaseEntitylist) {
			student.setApprovalStatusId(approvalStatusDto.getApprovalStatusId());
		}
		purchaseRepository.saveAll(studentPurchaseEntitylist);
		return "Inserted";
	}
}
