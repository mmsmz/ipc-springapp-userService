package com.ipc.userservice.UserService.ServiceImpl;

import Repository.PurchaseRepository;
import com.ipc.userservice.UserService.Controller.PurchaseController;
import com.ipc.userservice.UserService.Dto.CoursePriceDto;
import com.ipc.userservice.UserService.Dto.StudentPurchaseDto;
import com.ipc.userservice.UserService.Entity.StudentPurchaseEntity;
import com.ipc.userservice.UserService.Service.PurchaseService;
import com.ipc.userservice.UserService.Util.PurchaseConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@EnableJpaRepositories("com.ipc.PurchaseService.Repository")
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
            List<StudentPurchaseEntity> checkid = purchaseRepository.findByUserId(studentPurDto.getUserId());
            StudentPurchaseEntity studentPurEntity = new StudentPurchaseEntity();
            studentPurEntity.setUserId(studentPurDto.getUserId());
            studentPurEntity.setCoursePriceId(studentPurDto.getCoursePriceId());
            studentPurEntity.setCourseScheduleId(studentPurDto.getCourseScheduleId());
            studentPurEntity.setPaymentType(studentPurDto.getPaymentType());
            studentPurEntity.setReceiptImageLocation(studentPurDto.getReceiptImageLocation());
            studentPurEntity.setDiffTypeOfBank(studentPurDto.getDiffTypeOfBank());
            studentPurEntity.setDate(Instant.now());
            purchaseRepository.save(studentPurEntity);
            return PurchaseConstant.SUCCESSFULLY_REGISTERED;

    } catch(
    Exception e)

    {
        logger.info(e.getMessage());
        return e.getMessage();
    }

}

    /* To Remove Course Records From Summary */
    @Override
    public String removeCourseRecordsFromSummary(CoursePriceDto courseDto) {
        return null;
    }

    /* To Get Purchased Course Details To Summary Table */
    @Override
    public String getPurchasedCourseDetailsToSummary(StudentPurchaseDto studentPurchaseDto) {

        return null;

    }

    /* To Get All Menu Options To Page */
    @Override
    public String getAllMenuOptionsToPage(CoursePriceDto courseDto) {
        return null;
    }


}
