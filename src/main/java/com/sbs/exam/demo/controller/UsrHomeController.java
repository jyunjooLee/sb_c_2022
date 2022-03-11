package com.sbs.exam.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Controller /* 스프링에게 이것이 Controller라는걸 알려준다. */
public class UsrHomeController {
	private int count;

	public UsrHomeController() {
		count = -1;
	}

	@RequestMapping("/usr/home/getCount")
	@ResponseBody
	public int getCount() {
		count++;
		return count;
	}

	@RequestMapping("/usr/home/doSetCount")
	@ResponseBody
	public String doSetCount(int count) {
		this.count = count;
		return "Count의 값이 " + this.count + "으로 초기화";
	}

	@RequestMapping("/usr/home/getMap")
	@ResponseBody
	public Map<String, Object> getMap() {
		Map<String, Object> map = new HashMap<>();
		map.put("철수나이 :", 22222);
		map.put("영희나이 :", 11111);

		return map;
	}

	@RequestMapping("/usr/home/getList")
	@ResponseBody
	public List<String> getList() {
		List<String> lst = new ArrayList<>();
		lst.add("철수");
		lst.add("영희");
		return lst;
	}

	@RequestMapping("/usr/home/getArticle")
	@ResponseBody
	public Article getArticle() {
		//Article article = new Article(1234, "어노테이션");
		Article article = new Article();
		return article;
	}
	
	@RequestMapping("/usr/home/getArticles")
	@ResponseBody
	public List<Article> getArticles() {
		Article article1 = new Article(1111, "제목1111");  /* article1 선언해서 Article Class하나 실행해서 넣고 */
		Article article2 = new Article(2222, "제목2222");  /* article2 선언해서 Article Class하나 실행해서 넣고 */
		
		List<Article> lst = new ArrayList<>();
		lst.add(article1);
		lst.add(article2);
		
		return lst;
	}	
	
}

@Data
@NoArgsConstructor  /* Args가 없는 경우 */
@AllArgsConstructor /* Args를 직접 입력하게 만듬 */
class Article{
	
	private int id;
	private String title;
	
	
	
	
}


