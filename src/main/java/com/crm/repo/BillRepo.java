package com.crm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.entities.Bill;

public interface BillRepo extends JpaRepository<Bill,Long>{

}
