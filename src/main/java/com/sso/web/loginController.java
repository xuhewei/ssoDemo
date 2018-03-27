package com.sso.web;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sso.util.LoginCheck;

@Controller
@RequestMapping(value = "/sso")
public class loginController {
	
	@RequestMapping(value = "/test")
	public ModelAndView testLogin(){
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	//,produces=MediaType.APPLICATION_JSON_VALUE+";charset=utf-8
	@RequestMapping(value = "/doLogin", method=RequestMethod.POST, produces="text/html;charset=UTF-8")
	public ModelAndView doLogin(String username,String password,String gotoUrl,HttpServletResponse response){
		ModelAndView mv = new ModelAndView("login_fail");
		
		boolean ok = LoginCheck.checkLogin(username, password);
		if (ok) {
			 Cookie cookie = new Cookie(LoginCheck.COOKIE_NAME,LoginCheck.COOKIE_VALUE);
			 cookie.setPath("/");
			 response.addCookie(cookie);
			 mv.setViewName("redirect:"+gotoUrl);
		}
		return mv;
	}
	 /**
     * 跳转到登录页面
     * @return
     */
	@RequestMapping(value = "/login")
    public ModelAndView login(){
        return new ModelAndView("login");
    }

}
