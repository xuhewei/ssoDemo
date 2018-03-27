package com.sso.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/sso")
public class loginController {
	
	@RequestMapping(value = "/test")
	public String testLogin(){
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		return "index";
	}
	//,produces=MediaType.APPLICATION_JSON_VALUE+";charset=utf-8
	@RequestMapping(value = "/doLogin", method=RequestMethod.GET, produces="text/html;charset=UTF-8")
	public String doLogin(){
		
		return "login";
	}
}
