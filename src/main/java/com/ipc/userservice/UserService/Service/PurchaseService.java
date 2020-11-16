package com.ipc.userservice.UserService.Service;

import com.ipc.userservice.UserService.Dto.CoursePriceDto;
import com.ipc.userservice.UserService.Dto.StudentPurchaseDto;
import org.springframework.stereotype.Service;

@Service
public interface PurchaseService {

    // addCourseDetailsToSummary
    public String addCourseDetailsToSummary(StudentPurchaseDto studentPurDto);

    // removeCourseRecordsFromSummary
    public String removeCourseRecordsFromSummary(CoursePriceDto courseDto);

    // getPurchasedCourseDetailsToSummary

    public String getPurchasedCourseDetailsToSummary(StudentPurchaseDto studentPurchaseDto);


    // getAllMenuOptionsToPage

    public String getAllMenuOptionsToPage(CoursePriceDto courseDto);
    /* To Get All Menu Options To Page */

    /* To Add Course Details To Summary */

    /* To Remove Course Records From Summary */

    /* To Get Purchased Course Details To Summary Table */

}
