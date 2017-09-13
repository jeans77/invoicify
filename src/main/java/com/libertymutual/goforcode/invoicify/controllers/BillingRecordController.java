package com.libertymutual.goforcode.invoicify.controllers;

import javax.servlet.ServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/billing-records")

public class BillingRecordController {
	
	
	@GetMapping("")
	public String billing() {
		return "/billing-records/list";

	}

	
}