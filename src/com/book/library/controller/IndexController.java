package com.book.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="index")
public class IndexController {

	@RequestMapping(value="/test")
	public String toIndexPage(){
		return "index";
	}
}
