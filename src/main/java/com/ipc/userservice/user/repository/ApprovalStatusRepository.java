package com.ipc.userservice.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ipc.userservice.user.entity.ApprovalStatus;

public interface ApprovalStatusRepository extends JpaRepository<ApprovalStatus,String>{

}
