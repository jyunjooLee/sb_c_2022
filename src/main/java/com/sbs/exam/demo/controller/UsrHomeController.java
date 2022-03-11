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
	
	@RequestMapping("/usr/home/main") /* 이렇게 url이 들어오면 아래 함수(ShowMain)를 실행한다. */
	@ResponseBody						/* ShowMain 실행결과를 response 한다. */
	public String ShowMain() {
		return "안녕하세요.";
	}
	@RequestMapping("/usr/home/main2") /* 이렇게 url이 들어오면 아래 함수(ShowMain)를 실행한다. */
	@ResponseBody						/* ShowMain 실행결과를 response 한다. */
	public String ShowMain2() {
		return "반갑습니다.";
	}
	@RequestMapping("/usr/home/main3") /* 이렇게 url이 들어오면 아래 함수(ShowMain)를 실행한다. */
	@ResponseBody						/* ShowMain 실행결과를 response 한다. */
	public String ShowMain3() {
		return "또 만나요.";
	}
	@RequestMapping("/usr/home/main4") /* 이렇게 url이 들어오면 아래 함수(ShowMain)를 실행한다. */
	@ResponseBody						/* ShowMain 실행결과를 response 한다. */
	public int ShowMain4() {
		count++;
		return count; 
	}
	
	@RequestMapping("/usr/home/main5") /* 이렇게 url이 들어오면 아래 함수(ShowMain)를 실행한다. */
	@ResponseBody						/* ShowMain 실행결과를 response 한다. */
	public String ShowMain5() {
		count= -1;
		return "Count의 값이 0으로 초기화"; 
	}
	
}
