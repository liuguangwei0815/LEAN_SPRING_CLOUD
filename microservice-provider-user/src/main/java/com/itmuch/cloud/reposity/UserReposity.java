package com.itmuch.cloud.reposity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itmuch.cloud.entity.User;

@Repository
public interface UserReposity extends JpaRepository<User, Long> {

}
