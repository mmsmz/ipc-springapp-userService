package com.ipc.userservice.user.service;

import com.ipc.userservice.user.dto.FindByEmailDto;
import com.ipc.userservice.user.dto.Subjects;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    /* to find by email
    Request email
    Return userId */
    FindByEmailDto findByEmail(FindByEmailDto findByEmailDto);
}
