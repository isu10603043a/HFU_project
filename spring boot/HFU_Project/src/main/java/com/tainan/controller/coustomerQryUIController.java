package com.tainan.controller;

import java.util.List;

import org.apache.logging.log4j.message.StringFormattedMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.tainan.entity.Customers;
import com.tainan.entity.orderRecordEntity;
//import com.tanin.dao.userDao;

@Controller
public class coustomerQryUIController {
	
//	@Autowired
//	userDao userDao;
	
	@GetMapping("/customersqry")
	public String createCoustmerqry(Model model) {
		model.addAttribute("msg", "客戶資料查詢");
		
		return "index";
	}
	

	
	@GetMapping("/index")
	public String home() {
		return "index";
	}
}
