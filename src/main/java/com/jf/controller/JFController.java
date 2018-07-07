package com.jf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JFController {

	@RequestMapping("/test")
	public String main() {
		return "test";
	}

}
