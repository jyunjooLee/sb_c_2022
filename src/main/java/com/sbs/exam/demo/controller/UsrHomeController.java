package com.sbs.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller /* 스프링에게 이것이 Controller라는걸 알려준다.   */
public class UsrHomeController {
	private int count;
	public UsrHomeController() {
		count = -1;
	}
	
	@RequestMapping("/usr/home/getCount") /* 이렇게 url이 들어오면 아래 함수(ShowMain)를 실행한다. */
	@ResponseBody						/* ShowMain 실행결과를 response 한다. */
	public int getCount() {
		count++;
		return count; 
	}
	
	@RequestMapping("/usr/home/doSetCount") /* 이렇게 url이 들어오면 아래 함수(ShowMain)를 실행한다. */
	@ResponseBody						/* ShowMain 실행결과를 response 한다. */
	public String doSetCount(int count) {
		this.count = count;
		return "Count의 값이 "+this.count+"으로 초기화"; 
	}
	
}
