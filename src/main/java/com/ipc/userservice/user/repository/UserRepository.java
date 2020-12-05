package com.ipc.userservice.user.repository;

import com.ipc.userservice.user.entity.StudentPurchaseEntity;
import com.ipc.userservice.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

    UserEntity findByEmail(String email);
}
