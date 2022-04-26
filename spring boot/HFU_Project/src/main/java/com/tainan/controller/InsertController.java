package com.tainan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tainan.entity.HFUEntity;
import com.tainan.entity.orderRecordEntity;

public class InsertController {

	@Autowired 
	JdbcTemplate jdbcTemplate;
	
	@GetMapping("/add")
	public ResponseEntity<Object> customersQry(@RequestParam("add") String product) {
		
//		orderRecordEntity order =jdbcTemplate.update()
//		}, new Object[] { product });
		
		
		return null;
	}
	
}
