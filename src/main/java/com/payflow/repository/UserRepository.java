package com.payflow.repository;

import com.payflow.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUpiId(String upiId);

    @Query("SELECT u FROM User u WHERE u.balance > :amount")
    List<User> findUsersWithBalanceGreaterThan(Double amount);
}