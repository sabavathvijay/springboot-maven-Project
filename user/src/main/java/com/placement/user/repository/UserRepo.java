package com.placement.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placement.user.entity.UserEntity;

public interface UserRepo  extends JpaRepository< UserEntity , Integer> {

}
