package com.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.entities.Bill;
import com.crm.repo.BillRepo;

@Service
public class BilllServiceImpl implements BillService{
	
	@Autowired
	private BillRepo billRepo;

	@Override
	public Bill saveBill(Bill bill) {
		return billRepo.save(bill);
	}

}
