package com.tainan.controller;

import java.nio.charset.Charset;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import javax.xml.crypto.dsig.XMLObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tainan.entity.Customers;
import com.tainan.entity.Message;
import com.tainan.entity.jumpEntity;
import com.tainan.entity.orderRecordEntity;


import net.bytebuddy.asm.Advice.Return;

import com.tainan.entity.HFUEntity;


@Controller

public class CustomersController extends HttpServlet {

	@Autowired
	private JdbcTemplate jdbctample;


	@GetMapping("/customer/qrybyid")
	public ResponseEntity<Object> customersQry(@RequestParam("cid") String product ,Model model) {
		//以上無法抓取資料	
//		product = "charger";
		//以下查詢正常
		String sql = "select * from stockList where product = ?";
			
			model.addAttribute("msg", "test");
		
		
			HFUEntity cust = jdbctample.queryForObject(sql, (rs, num) -> {
				HFUEntity customers = new HFUEntity();
				customers.setProduct(rs.getString("product"));
				customers.setPrice(Integer.parseInt(rs.getString("price")));
				customers.setStockQuantity(Integer.parseInt( rs.getString("stockQuantity")));
				return customers;
			}, new Object[] { product });
			
			ResponseEntity responseEntity = new ResponseEntity<>(cust, HttpStatus.OK);
			return responseEntity;

		
		
	}

	@GetMapping("/stop")
	public String stopHtml() {
		return "stop";
	}
	

	@RequestMapping(value = "/index", produces = {"application/json;charset=UTF-8"})
	public orderRecordEntity add(@RequestBody orderRecordEntity order) {
		System.out.println(order.toString());
		String sql = "insert into orderRecord (productName,purchaseQuantity) values(?,?)";
		jdbctample.update(sql , order.getProductName(),order.getPurchaseQuantity());
		System.out.println(order);
		return order;
	}

	
	@RequestMapping(path = { "/customer/add", "customers/insert" }, method = { RequestMethod.POST })
	public Customers cuestomersAdd(@RequestBody() Customers customers) {
		return customers;
	}
}
