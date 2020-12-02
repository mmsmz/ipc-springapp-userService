package com.ipc.userservice.user.service.serviceImpl;

import com.ipc.userservice.user.dto.*;
import com.ipc.userservice.user.entity.CoursePriceEntity;
import com.ipc.userservice.user.entity.CourseScheduleEntity;
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

	/* To Get All Menu Options To Page */
//	@Override
//	public List<Subjects> getAllMenuOptionsToPage() {
//		try {
//			List<CoursePriceEntity> courseEntityList = coursePriceRepository.findAll();
//
//			List<Subjects> subjectsList = new ArrayList<>();
//
//			cpEntity: for (CoursePriceEntity cpEntity : courseEntityList) {
//
//				List<CourseScheduleEntity> courseScheduleEntitylist = courseScheduleRepository
//						.findByCrsprid(cpEntity.getCoursePriceId());
//				boolean flag = false;
//				for (Subjects subjects : subjectsList) {
//					if (subjects.getSubjectName().equals(cpEntity.getSubjectName())) {
//						flag = true;
//						ArrayList<String> shedule = new ArrayList<String>();
//
//						subjects.getSubjectCategories()
//								.add(new SubjectCategory(cpEntity.getSubjectCategory(), cpEntity.getPrice(), shedule));
//
//						for (CourseScheduleEntity courseScheduleEntity : courseScheduleEntitylist) {
//
//							shedule.add(courseScheduleEntity.getDay() + " " + courseScheduleEntity.getTime());
//
//						}
//						continue cpEntity;
//					}
//				}
//				subjectsList.add(new Subjects(cpEntity.getSubjectName(), new ArrayList<SubjectCategory>()));
//				subjectsList.get(subjectsList.size() - 1).getSubjectCategories().add(
//						new SubjectCategory(cpEntity.getSubjectCategory(), cpEntity.getPrice(), new ArrayList<>()));
//				for (CourseScheduleEntity courseScheduleEntity : courseScheduleEntitylist) {
//					subjectsList.get(subjectsList.size() - 1).getSubjectCategories().get(0).getSchedule()
//							.add(courseScheduleEntity.getDay() + " " + courseScheduleEntity.getTime());
//				}
//			}
//			return subjectsList;
//		} catch (Exception e) {
//			logger.info(e.getMessage());
//			// return e.getMessage();
//			return null;
//		}
//	}

	/* To Add Course Details To Summary */
	@Override
	public String addCourseDetailsToSummary(String userId, PurchaseCartDto purchaseCartDto) {

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

			List<StudentPurchaseEntity> StudentPurchaseEntitylist = purchaseRepository.findByUserId(userId);
			Purchase: for (StudentPurchaseEntity student : StudentPurchaseEntitylist) {
				Object temp = coursePriceRepository.findById(student.getCoursePriceId());
				CoursePriceEntity cpEntity = (CoursePriceEntity) temp;
				temp = courseScheduleRepository.findById(student.getCourseScheduleId());
				CourseScheduleEntity courseScheduleEntity = (CourseScheduleEntity) temp;

				for (Subjects subjects : subjectsList) {
					if (subjects.getSubjectName().equals(cpEntity.getSubjectName())) {
						ArrayList<CourseSchedule> shedule = new ArrayList<CourseSchedule>();

						subjects.getSubjectCategories().add(new SubjectCategory(cpEntity.getCoursePriceId(),
								cpEntity.getSubjectCategory(), cpEntity.getPrice(), shedule));

						shedule.add(new CourseSchedule(courseScheduleEntity.getCourseScheduleId(),
								courseScheduleEntity.getDay() + " " + courseScheduleEntity.getTime()));
						continue Purchase;
					}
				}
				subjectsList.add(new Subjects(cpEntity.getSubjectName(), new ArrayList<SubjectCategory>()));
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
	public String removeCourseRecordsFromSummary(StudentPurchaseDto studentPurDto) {
		try {
			StudentPurchaseEntity studentPurEntity = new StudentPurchaseEntity();
			// studentPurEntity.setUserId(studentPurDto.getUserId());
			studentPurEntity.setCoursePriceId(studentPurDto.getCoursePriceId());
			studentPurEntity.setCourseScheduleId(studentPurDto.getCourseScheduleId());
//			studentPurEntity.setPaymentType(studentPurDto.getPaymentType());
//			studentPurEntity.setReceiptImageLocation(studentPurDto.getReceiptImageLocation());
//			studentPurEntity.setAmountDeposited(studentPurDto.getAmountDeposited());
//			studentPurEntity.setDiffTypeOfBank(studentPurDto.getDiffTypeOfBank());
//			studentPurEntity.setDate(Instant.now());
			// purchaseRepository.deleteById(studentPurDto.getUserId());
			return CommonConstant.SUCCESSFULLY;
		} catch (Exception e) {
			logger.info(e.getMessage());
			return e.getMessage();
		}
	}

	/* To Get Purchased Course Details To Summary Table */
	@Override
	public String getPurchasedCourseDetailsToSummary(StudentPurchaseDto studentPurDto) {

//		try {
//			List<StudentPurchaseEntity> checkUserId = purchaseRepository.findByUserId(studentPurDto.getUserId());
//			if (checkUserId.isEmpty()) {
//				StudentPurchaseEntity studentPurEntity = new StudentPurchaseEntity();
//				studentPurEntity.setStudentPurchaseId(studentPurDto.getStudentPurchaseId());
//				studentPurEntity.setUserId(studentPurDto.getUserId());
//				studentPurEntity.setCoursePriceId(studentPurDto.getCoursePriceId());
//				studentPurEntity.setCourseScheduleId(studentPurDto.getCourseScheduleId());
//				studentPurEntity.setApprovalStatusId(studentPurDto.getApprovalStatusId());
//				studentPurEntity.setPaymentType(studentPurDto.getPaymentType());
//				studentPurEntity.setReceiptImageLocation(studentPurDto.getReceiptImageLocation());
//				studentPurEntity.setAmountDeposited(studentPurDto.getAmountDeposited());
//				studentPurEntity.setDiffTypeOfBank(studentPurDto.getDiffTypeOfBank());
//				studentPurEntity.setDate(Instant.now());
//				 purchaseRepository.findAllById(studentPurDto.getUserId());
//				return CommonConstant.SUCCESSFULLY;
//			} else {
//				logger.info(CommonConstant.ERROR);
//				return CommonConstant.ERROR;
//			}
//		} catch (Exception e) {
//			logger.info(e.getMessage());
//			return e.getMessage();
//		}
		return null;
	}

	/* To allow Student to confirm the purchase details */
	@Override
	public String confirmPurchase(StudentPurchaseDto studentPurDto) {
		// updating the purchase
		/*
		 * try { StudentPurchaseEntity existingStudentPurchase =
		 * purchaseRepository.findById(studentPurDto.getUserId()) .orElse(null);
		 * 
		 * existingStudentPurchase.setStudentPurchaseId(studentPurDto.
		 * getStudentPurchaseId());
		 * existingStudentPurchase.setUserId(studentPurDto.getUserId());
		 * existingStudentPurchase.setCoursePriceId(studentPurDto.getCoursePriceId());
		 * existingStudentPurchase.setCourseScheduleId(studentPurDto.getCourseScheduleId
		 * ());
		 * existingStudentPurchase.setApprovalStatusId(studentPurDto.getApprovalStatusId
		 * ()); existingStudentPurchase.setPaymentType(studentPurDto.getPaymentType());
		 * existingStudentPurchase.setReceiptImageLocation(studentPurDto.
		 * getReceiptImageLocation());
		 * existingStudentPurchase.setAmountDeposited(studentPurDto.getAmountDeposited()
		 * );
		 * existingStudentPurchase.setDiffTypeOfBank(studentPurDto.getDiffTypeOfBank());
		 * existingStudentPurchase.setDate(Instant.now());
		 * purchaseRepository.save(existingStudentPurchase); logger.info("Updated {}",
		 * CommonConstant.SUCCESSFULLY); } catch (Exception e) {
		 * logger.info(e.getMessage()); return e.getMessage(); }
		 */
		return null;
	}
}
