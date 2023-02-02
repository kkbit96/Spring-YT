package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		int a=67;
		int b=80;
		return "This is a test\t sum of a and b is\t"+(a+b);
		
	}
}
