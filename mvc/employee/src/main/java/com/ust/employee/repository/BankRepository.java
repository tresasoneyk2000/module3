package com.ust.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.employee.entity.Bank;
@Repository
public interface BankRepository extends JpaRepository<Bank,Long> {

}
