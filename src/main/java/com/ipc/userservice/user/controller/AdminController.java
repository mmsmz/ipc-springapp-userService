package com.ipc.userservice.user.controller;

import com.ipc.userservice.user.dto.CoursePriceDto;
import com.ipc.userservice.user.dto.ResponseDto;
import com.ipc.userservice.user.dto.UserDto;
import com.ipc.userservice.user.service.AdminService;
import com.ipc.userservice.user.util.CommonConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("AdminController")
public class AdminController {

    /**
     * The Logger
     */
    final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    AdminService adminService;

    @GetMapping("/")
    String admin() {
        return "<h1>Welcome!!!</h1>";
    }

    // create users - manager
    @PostMapping(value = "/addUser", produces = "application/json")
    public ResponseEntity<ResponseDto> addUser(@RequestBody UserDto userDto) {
        return null;
    }

    // deactivate user
    @PostMapping(value = "/deActivateUser", produces = "application/json")
    public ResponseEntity<ResponseDto> deActivateUser(@RequestBody UserDto userDto) {
        return null;
    }

    // update user details
    @PostMapping(value = "/updateUser", produces = "application/json")
    public ResponseEntity<ResponseDto> updateUser(@RequestBody UserDto userDto) {
        return null;
    }

    // NEED TO implement the following APIs

    /* Home Page Api's
    *  - show Banners and smaller Banners and logos
       - show optional - updating modules (Not Necessary)
       - show getcoursePrice&Scheduling
    *  -
    * */

      /* student Profile Page
        - student details (displaying the name)
        - updating the balance details if the student signs in from google account
        - history of purchase details
        - notifications alerts
      */

       /* Dashboard
       > Student
            - manage users [Student] (view, search, add, deactivate)
       > Course Details >>  (manage subjectsType, manage subjectCategory, manage subjectSchedule)
           - manage coursePrice (crsPriceId, subjectName, SubjectCategory, Price)
           - manage courseSchedule  (crsSchedId,crsPriceId, Day,Time)
       > Home Page
            - update Banners and smaller Banners and logos
       > Purchase Details
            - Manage student purchase details
       > ApprovalStatus ( Validate check purchase record for a specific student and send them a notification message)
            -* Display the studentpurchase details with the depositedAmount validate with coursePrice Total
            - Manage approvalStatus (apvlStatid, studpurid, approvalStatus, passcode, comments)
       > Reports (generating 7 reports)
       > Users - manger (add, view, deactivate)

       */

    /** Dashboard
     * Course Details >> To Add Course & Price Details
     * add data
     */
    @PostMapping(value = "/addCoursePriceDetails", produces = "application/json")
    public ResponseEntity<ResponseDto> addCoursePriceDetails(@RequestBody CoursePriceDto coursePriceDto) {
        logger.info("Inside the Add Course Price Details method Start {}", coursePriceDto.toString());

        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage(CommonConstant.SUCCESS);
        responseDto.setData( adminService.addCoursePriceDetails(coursePriceDto));
        logger.info("Inside the Add Course Price Details method End");

        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }
}
