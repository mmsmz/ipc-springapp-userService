package com.ipc.userservice.user.controller;

import com.ipc.userservice.user.dto.FindByEmailDto;
import com.ipc.userservice.user.dto.ResponseDto;
import com.ipc.userservice.user.dto.Subjects;
import com.ipc.userservice.user.service.PurchaseService;
import com.ipc.userservice.user.service.UserService;
import com.ipc.userservice.user.util.CommonConstant;
import io.swagger.annotations.ResponseHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/UserController")
public class UserController {

    /**
     * The Logger
     */
    final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @PostMapping(value = "/findByEmail", produces = "application/json")
    public ResponseEntity<ResponseDto> findByEmail(@RequestBody FindByEmailDto findByEmailDto) {
        logger.info("Inside the Find By Email method Start");

        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage(CommonConstant.SUCCESS);
        responseDto.setData(userService.findByEmail(findByEmailDto));

        logger.info("Inside the Find By Email method End");
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

    @GetMapping(value = "/getUserName", produces = "application/json")
    public ResponseEntity<ResponseDto> getUserName(@RequestHeader String userId) {
        logger.info("Inside the Get User Name method Start");

        ResponseDto responseDto = new ResponseDto();
        responseDto.setMessage(CommonConstant.SUCCESS);
        responseDto.setData(userService.getUserName(userId));

        logger.info("Inside the Get User Name method End");
        return new ResponseEntity<>(responseDto, HttpStatus.OK);

    }

    @GetMapping("/test")
    String test(HttpServletResponse response) {
    // response.addHeader("Access-Control-Allow-Origin", "*" );
        // response.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        return "Welcome!!!";
    }




}
