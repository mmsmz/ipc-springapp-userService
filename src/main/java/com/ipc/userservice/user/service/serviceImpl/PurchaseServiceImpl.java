package com.ipc.userservice.user.service.serviceImpl;

import com.ipc.userservice.user.repository.PurchaseRepository;
import com.ipc.userservice.user.controller.PurchaseController;
import com.ipc.userservice.user.dto.StudentPurchaseDto;
import com.ipc.userservice.user.entity.StudentPurchaseEntity;
import com.ipc.userservice.user.service.PurchaseService;
import com.ipc.userservice.user.util.CommonConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
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


    /* To Add Course Details To Summary */
    @Override
    public String addCourseDetailsToSummary(StudentPurchaseDto studentPurDto) {

        try {
            StudentPurchaseEntity studentPurEntity = new StudentPurchaseEntity();
            studentPurEntity.setUserId(studentPurDto.getUserId());
            studentPurEntity.setCoursePriceId(studentPurDto.getCoursePriceId());
            studentPurEntity.setCourseScheduleId(studentPurDto.getCourseScheduleId());
            studentPurEntity.setPaymentType(studentPurDto.getPaymentType());
            studentPurEntity.setReceiptImageLocation(studentPurDto.getReceiptImageLocation());
            studentPurEntity.setAmountDeposited(studentPurDto.getAmountDeposited());
            studentPurEntity.setDiffTypeOfBank(studentPurDto.getDiffTypeOfBank());
            studentPurEntity.setDate(Instant.now());
            purchaseRepository.save(studentPurEntity);
            return CommonConstant.SUCCESSFULLY_REGISTERED;
        } catch (Exception e) {
            logger.info(e.getMessage());
            return e.getMessage();
        }
    }

    /* To Remove Course Records From Summary */
    @Override
    public String removeCourseRecordsFromSummary(StudentPurchaseDto studentPurchaseDto) {
        return null;
    }

    /* To Get Purchased Course Details To Summary Table */
    @Override
    public String getPurchasedCourseDetailsToSummary(StudentPurchaseDto studentPurDto) {

        try {
            List<StudentPurchaseEntity> checkUserId = purchaseRepository.findByUserId(studentPurDto.getUserId());
            if(checkUserId.isEmpty()) {
                StudentPurchaseEntity studentPurEntity = new StudentPurchaseEntity();
                studentPurEntity.setUserId(studentPurDto.getUserId());
                studentPurEntity.setCoursePriceId(studentPurDto.getCoursePriceId());
                studentPurEntity.setCourseScheduleId(studentPurDto.getCourseScheduleId());
                studentPurEntity.setPaymentType(studentPurDto.getPaymentType());
                studentPurEntity.setReceiptImageLocation(studentPurDto.getReceiptImageLocation());
                studentPurEntity.setAmountDeposited(studentPurDto.getAmountDeposited());
                studentPurEntity.setDiffTypeOfBank(studentPurDto.getDiffTypeOfBank());
                studentPurEntity.setDate(Instant.now());
                // purchaseRepository.getOne();
                return CommonConstant.SUCCESSFULLY_REGISTERED;
            }
            else {
                logger.info(CommonConstant.ERROR);
                return CommonConstant.ERROR;
            }
        } catch (Exception e) {
            logger.info(e.getMessage());
            return e.getMessage();
        }

    }

    /* To Get All Menu Options To Page */
    @Override
    public String getAllMenuOptionsToPage(StudentPurchaseDto studentPurDto) {

        /* subject type, subject category. price from coursePrice Table
            - Subject Type - Economic or Business
            - Subject Category - 2021 Revision, 2021 Theory, 2022 Theory
            - summary table

        * crsprId, day and time from  courseSchedule table
            - class DateTime Menu - show wednesday + startTime to EndTime
        */
        try {
            StudentPurchaseEntity studentPurEntity = new StudentPurchaseEntity();
            studentPurEntity.setUserId(studentPurDto.getUserId());
          //  studentPurEntity.setCoursePriceId(studentPurDto.getCoursePriceId());
            studentPurEntity.setCourseScheduleId(studentPurDto.getCourseScheduleId());
            studentPurEntity.setPaymentType(studentPurDto.getPaymentType());
            studentPurEntity.setReceiptImageLocation(studentPurDto.getReceiptImageLocation());
            studentPurEntity.setAmountDeposited(studentPurDto.getAmountDeposited());
            studentPurEntity.setDiffTypeOfBank(studentPurDto.getDiffTypeOfBank());
            studentPurEntity.setDate(Instant.now());
            // purchaseRepository.save(studentPurEntity); get
            return CommonConstant.SUCCESSFULLY_REGISTERED;
        } catch (Exception e) {
            logger.info(e.getMessage());
            return e.getMessage();
        }
    }

    /* To allow Student to confirm the purchase details */
    @Override
    public String confirmPurchase(StudentPurchaseDto studentPurDto) {

        try {
            StudentPurchaseEntity studentPurEntity = new StudentPurchaseEntity();
            studentPurEntity.setUserId(studentPurDto.getUserId());
            studentPurEntity.setCoursePriceId(studentPurDto.getCoursePriceId());
            studentPurEntity.setCourseScheduleId(studentPurDto.getCourseScheduleId());
            studentPurEntity.setPaymentType(studentPurDto.getPaymentType());
            studentPurEntity.setReceiptImageLocation(studentPurDto.getReceiptImageLocation());
            studentPurEntity.setAmountDeposited(studentPurDto.getAmountDeposited());
            studentPurEntity.setDiffTypeOfBank(studentPurDto.getDiffTypeOfBank());
            studentPurEntity.setDate(Instant.now());
            // purchaseRepository.save(studentPurEntity);
            return CommonConstant.SUCCESSFULLY_REGISTERED;
        } catch (Exception e) {
            logger.info(e.getMessage());
            return e.getMessage();
        }
    }




}
