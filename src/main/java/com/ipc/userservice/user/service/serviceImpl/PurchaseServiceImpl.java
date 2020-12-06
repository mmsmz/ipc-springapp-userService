package com.ipc.userservice.user.service.serviceImpl;

import com.ipc.userservice.user.dto.*;
import com.ipc.userservice.user.entity.ApprovalStatusEntity;
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

import java.time.LocalDate;
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
			logger.info("Inside the Remove Course Records From Summary method Start");
			List<StudentPurchaseEntity> studentPurchaseEntityList = purchaseRepository
					.findByUserIdAndCoursePriceIdAndCourseScheduleIdAndApprovalStatusId(userId,
							purchaseCartDto.getCoursePriceId(), purchaseCartDto.getCourseScheduleId(), null);

			for (StudentPurchaseEntity student : studentPurchaseEntityList) {
				purchaseRepository.delete(student);
			}

			return "removed the record";

		} catch (Exception e) {
			logger.info(e.getMessage());
			return e.getMessage();
		}

	}

	/* To allow Student to confirm the purchase details */
	@Override
	public String confirmPurchase(String userId, ApprovalStatusDto approvalStatusDto) {
		LocalDate localDate = LocalDate.now();

		ApprovalStatusEntity approvalStatus = new ApprovalStatusEntity();
		approvalStatus.setAmountDeposited(approvalStatusDto.getAmountDeposited());
		approvalStatus.setApprovalStatus(approvalStatusDto.getApprovalStatus());
		approvalStatus.setComments(approvalStatusDto.getComments());
		approvalStatus.setDepositedBank(approvalStatusDto.getDepositedBank());
		approvalStatus.setPaymentType(approvalStatusDto.getPaymentType());
		approvalStatus.setReceiptImageLocation(approvalStatusDto.getReceiptImgLocation());
		approvalStatus.setDate(localDate);
		approvalStatusRepository.save(approvalStatus);
		List<StudentPurchaseEntity> studentPurchaseEntitylist = purchaseRepository.findByUserId(userId);

		for (StudentPurchaseEntity student : studentPurchaseEntitylist) {
			student.setApprovalStatusId(approvalStatus.getApprovalStatusId());
		}
		purchaseRepository.saveAll(studentPurchaseEntitylist);
		return "Inserted";
	}

	@Override
	public List<ConfirmApprovalDto> getConfirmApprovalStatus(String userId) {
		// using userid take all not null values of approvaluserid
		List<ConfirmApprovalDto> subjectsList = new ArrayList<>();
		List<StudentPurchaseEntity> studentPurchaseEntitylist = purchaseRepository
				.findByUserIdAndApprovalStatusIdNotNull(userId);
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
			Optional<ApprovalStatusEntity> temp3 = approvalStatusRepository.findById(student.getApprovalStatusId());
			ApprovalStatusEntity approvalStatusEntity = temp3.get();
			subjectsList.add(new ConfirmApprovalDto(cpEntity.getSubjectName(), new ArrayList<>(),
					approvalStatusEntity.getComments(), courseScheduleEntity.getPassCode(),
					courseScheduleEntity.getMeetingId(), approvalStatusEntity.getApprovalStatus(),
					approvalStatusEntity.getApprovalStatusId()));
			subjectsList.get(subjectsList.size() - 1).getSubjectCategories()
					.add(new SubjectCategory(cpEntity.getCoursePriceId(), cpEntity.getSubjectCategory(),
							cpEntity.getPrice(), new ArrayList<>()));
			subjectsList.get(subjectsList.size() - 1).getSubjectCategories().get(0).getSchedule()
					.add(new CourseSchedule(courseScheduleEntity.getCourseScheduleId(),
							courseScheduleEntity.getDay() + courseScheduleEntity.getTime()));
		}
		return subjectsList;
	}
}
