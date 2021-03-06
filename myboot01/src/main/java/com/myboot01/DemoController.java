package com.myboot01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	
	@ResponseBody
	@RequestMapping("/")
	public String home() {
		System.out.println("hello boot!");
		return "Hello boot!";
	}
	
	@RequestMapping("/hello.do")
	public String hello(MemberVO memberVO) {
		memberVO.getId();
		return "hello";
	}
	
}
