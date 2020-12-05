package com.ipc.userservice.user.service.serviceImpl;

import com.ipc.userservice.user.dto.FindByEmailDto;
import com.ipc.userservice.user.dto.Subjects;
import com.ipc.userservice.user.entity.ApprovalStatusEntity;
import com.ipc.userservice.user.entity.StudentPurchaseEntity;
import com.ipc.userservice.user.entity.UserEntity;
import com.ipc.userservice.user.repository.UserRepository;
import com.ipc.userservice.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    /**
     * The Logger
     */
    final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserRepository userRepository;

    @Override
    public FindByEmailDto findByEmail(FindByEmailDto findByEmailDto) {

        UserEntity userEntity = userRepository.findByEmail(findByEmailDto.getEmail());
        findByEmailDto.setUserid(userEntity.getUserId());

        return findByEmailDto;
    }
}
