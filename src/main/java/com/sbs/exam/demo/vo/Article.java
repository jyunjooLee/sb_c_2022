package com.sbs.exam.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor  /* Args가 없는 경우 */
@AllArgsConstructor /* Args를 직접 입력하게 만듬 */
public class Article{
	
	private int id;
	private String title;
	private String body;
}

