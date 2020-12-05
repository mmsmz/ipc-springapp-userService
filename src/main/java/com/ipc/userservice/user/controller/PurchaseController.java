package com.ipc.userservice.user.controller;

import com.ipc.userservice.user.dto.ApprovalStatusDto;
import com.ipc.userservice.user.dto.PurchaseCartDto;
import com.ipc.userservice.user.dto.ResponseDto;
import com.ipc.userservice.user.dto.StudentPurchaseDto;
import com.ipc.userservice.user.dto.Subjects;
import com.ipc.userservice.user.service.PurchaseService;
import com.ipc.userservice.user.util.CommonConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/PurchaseController")
public class PurchaseController {

    /**
     * The Logger
     */
    final Logger logger = LoggerFactory.getLogger(PurchaseController.class);

    @Autowired
    PurchaseService purchaseService;


    /* To Add Course To Purchase Summary
     * the following data will be saved into the student purchase table
     * */
    @PostMapping(value = "/addCourseToPurchaseSummary", produces = "application/json")
    public ResponseEntity<ResponseDto> addCourseToPurchaseSummary(@RequestHeader String userId, @RequestBody PurchaseCartDto purchaseCartDto) {
        logger.info("Inside the Add Course Details To Summary method Start" + "userID: " + userId + " " + purchaseCartDto.toString());

        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage(CommonConstant.SUCCESS);
        responseDto.setData(purchaseService.addCourseToPurchaseSummary(userId, purchaseCartDto));
        logger.info("Inside the Add Course Details To Summary method End");

        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

    /* To Get All Menu Options To Page
     * getting the following data from CoursePrice and CourseSchedule Tables
     *
     * */
    @GetMapping(value = "/getAddedCourseDetailsToSummary", produces = "application/json")
    public ResponseEntity<ResponseDto> getAddedCourseDetailsToSummary(@RequestHeader String userId) {
        logger.info("Inside the Get Added Course Details To Summary method Start");
        List<Subjects> addedCourseList = purchaseService.getAddedCourseDetailsToSummary(userId);

        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage(CommonConstant.SUCCESS);
        responseDto.setData(addedCourseList);

        logger.info("Inside the Get Added Course Details To Summary method End");

        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }


    /* To Remove Course Records From Summary Table
     * the following data will be removed from student purchase table
     * */
    @PostMapping(value = "/removeCourseRecordsFromSummary", produces = "application/json")
    public ResponseEntity<ResponseDto> removeCourseRecordsFromSummary(@RequestHeader String userId, @RequestBody PurchaseCartDto purchaseCartDto) {
        logger.info("Inside the Remove Course Records From Summary method Start" + userId);

        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage(CommonConstant.SUCCESS);
        responseDto.setData(purchaseService.removeCourseRecordsFromSummary(userId, purchaseCartDto));
        logger.info("Inside the Remove Course Records From Summary method End");

        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }


    /*  To allow Student to confirm the purchase details
     *
     * */
    @PostMapping(value = "/confirmPurchase", produces = "application/json")
    public ResponseEntity<ResponseDto> confirmPurchase(@RequestHeader String userId, @RequestBody ApprovalStatusDto approvalStatusDto) {
        logger.info("Inside the student confirm Purchase method Start" + approvalStatusDto.toString());

        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage(CommonConstant.SUCCESS);
        responseDto.setData(purchaseService.confirmPurchase(userId, approvalStatusDto));
        logger.info("Inside the student confirm Purchase method End");

        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

    // once confirmed this API used to display the below table.

    @PostMapping(value = "/getConfirmApprovalStatus", produces = "application/json")
    public ResponseEntity<ResponseDto> getConfirmApproval(@RequestHeader String userId, @RequestBody PurchaseCartDto purchaseCartDto) {
        logger.info("Inside the Get Confirm Approval method Start" + purchaseCartDto.toString());

        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage(CommonConstant.SUCCESS);
        responseDto.setData(purchaseService.getConfirmApprovalStatus(userId, purchaseCartDto));
        logger.info("Inside the  Get Confirm Approval method End");

        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

}
