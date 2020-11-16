package com.ipc.userservice.UserService.ServiceImpl;

import com.ipc.userservice.UserService.Controller.PurchaseController;
import com.ipc.userservice.UserService.Dto.CoursePriceDto;
import com.ipc.userservice.UserService.Dto.StudentPurchaseDto;
import com.ipc.userservice.UserService.Service.PurchaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

@Service
@EnableJpaRepositories("com.ipc.PurchaseService.Repository")
public class PurchaseServiceImpl implements PurchaseService {

    /**
     * The Logger
     */
    final Logger logger = LoggerFactory.getLogger(PurchaseController.class);


    /* To Add Course Details To Summary */
    @Override
    public String addCourseDetailsToSummary(CoursePriceDto courseDto) {
        return null;
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
