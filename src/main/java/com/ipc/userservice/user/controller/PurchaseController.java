package com.ipc.userservice.user.controller;

import com.ipc.userservice.user.dto.ResponseDto;
import com.ipc.userservice.user.dto.StudentPurchaseDto;
import com.ipc.userservice.user.service.PurchaseService;
import com.ipc.userservice.user.util.CommonConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    /* To Get All Menu Options To Page
     * getting the following data from CoursePrice and CourseSchedule Tables
     *
     * */
    @GetMapping(value = "/getAllMenuOptionsToPage", produces = "application/json")
    public ResponseEntity<ResponseDto> getAllMenuOptionsToPage() {
        logger.info("Inside the Get All Menu Options To Page method Start");

        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage(CommonConstant.SUCCESS);
        responseDto.setData(purchaseService.getAllMenuOptionsToPage());
        logger.info("Inside the Get All Menu Options To Page method End");

        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

    /* To Add Course Details To Summary
     * the following data will be saved into the student purchase table
     * */
    @PostMapping(value = "/addCourseDetailsToSummary", produces = "application/json")
    public ResponseEntity<ResponseDto> addCourseDetailsToSummary(@RequestBody StudentPurchaseDto studentPurDto) {
        logger.info("Inside the Add Course Details To Summary method Start" + studentPurDto.toString());

        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage(CommonConstant.SUCCESS);
        responseDto.setData(purchaseService.addCourseDetailsToSummary(studentPurDto));
        logger.info("Inside the Add Course Details To Summary method End");

        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

    /* To Remove Course Records From Summary Table
    * the following data will be removed from student purchase table
    * */
    @PostMapping(value = "/removeCourseRecordsFromSummary", produces = "application/json")
    public ResponseEntity<ResponseDto> removeCourseRecordsFromSummary(@RequestBody StudentPurchaseDto studentPurchaseDto) {
        logger.info("Inside the Remove Course Records From Summary method Start" + studentPurchaseDto.toString());

        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage(CommonConstant.SUCCESS);
        responseDto.setData(purchaseService.removeCourseRecordsFromSummary(studentPurchaseDto));
        logger.info("Inside the Remove Course Records From Summary method End");

        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

    // refer the Resourse -> output -> .json
    /* To Get Purchased Course Details To Summary Table
    *  the following data will be retrieved from student purchase table
    * */
    @GetMapping(value = "/getPurchasedCourseDetailsToSummary", produces = "application/json")
    public ResponseEntity<ResponseDto> getPurchasedCourseDetailsToSummary(@RequestBody StudentPurchaseDto studentPurDto) {
        logger.info("Inside the Get Purchased Course Details To Summary method Start" + studentPurDto.toString());

        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage(CommonConstant.SUCCESS);
        responseDto.setData(purchaseService.getPurchasedCourseDetailsToSummary(studentPurDto));
        logger.info("Inside the Get Purchased Course Details To Summary method End");

        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

    /*  To allow Student to confirm the purchase details
     *
     * */
    @PostMapping(value = "/confirmPurchase", produces = "application/json")
    public ResponseEntity<ResponseDto> confirmPurchase(@RequestBody StudentPurchaseDto studentPurDto) {
        logger.info("Inside the student confirm Purchase method Start" + studentPurDto.toString());

        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage(CommonConstant.SUCCESS);
        responseDto.setData(purchaseService.confirmPurchase(studentPurDto));
        logger.info("Inside the student confirm Purchase method End");

        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

//    @GetMapping("/admin")
//    public String admin() {
//        return "<h1>Hello Admin</h1>";
//    }

}
