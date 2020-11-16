package com.ipc.userservice.UserService.Controller;

import com.ipc.userservice.UserService.Dto.CoursePriceDto;
import com.ipc.userservice.UserService.Dto.ResponseDto;
import com.ipc.userservice.UserService.Dto.StudentPurchaseDto;
import com.ipc.userservice.UserService.Service.PurchaseService;
import com.ipc.userservice.UserService.Util.PurchaseConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class PurchaseController {

    /**
     * The Logger
     */
    final Logger logger = LoggerFactory.getLogger(PurchaseController.class);

    @Autowired
    PurchaseService purchaseService;

    @GetMapping("/")
    String home() {
        return "<h1>Welcome!!!</h1>";
    }

    // addCourseDetailsToSummary
    @GetMapping(value = "/addCourseDetailsToSummary", produces = "application/json")
    public ResponseEntity<ResponseDto> addCourseDetailsToSummary(@RequestBody StudentPurchaseDto studentPurDto) {
        logger.info("Inside the get Purchased Course Details To Summary method Start" + studentPurDto.toString());

        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage(PurchaseConstant.SUCCESS);
        responseDto.setData( purchaseService.addCourseDetailsToSummary(studentPurDto));
        logger.info("Inside the get Purchased Course Details To Summary method End");
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

    // removeCourseRecordsFromSummary

    /* To Get Purchased Course Details To Summary Table */
    @GetMapping(value = "/getPurchasedCourseDetailsToSummary", produces = "application/json")
    public ResponseEntity<ResponseDto> getPurchasedCourseDetailsToSummary(@RequestBody StudentPurchaseDto studentPurchaseDto) {
        logger.info("Inside the get Purchased Course Details To Summary method Start" + studentPurchaseDto.toString());

        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage(PurchaseConstant.SUCCESS);
        responseDto.setData( purchaseService.getPurchasedCourseDetailsToSummary(studentPurchaseDto));
        logger.info("Inside the get Purchased Course Details To Summary method End");
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

    /* To Get All Menu Options To Page */

    /* To Add Course Details To Summary */

    /* To Remove Course Records From Summary */

    /* To Get Purchased Course Details To Summary Table */
    @GetMapping("/admin")
    public String admin() {
        return "<h1>Hello Admin</h1>";
    }
}
