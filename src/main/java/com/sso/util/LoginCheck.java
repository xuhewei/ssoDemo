package com.sso.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * 
 * @author xuhewei
   @date 2018/03/27
 *
 */
public class LoginCheck {
    /** 测试用户名 */
    public static final String USERNAME="user";
    /** 测试密码*/
    public static final String PASSWORD="123";
    /** Cookie键 */
    public static final String COOKIE_NAME = "ssocookie";
    /** Cookie值*/
    public static final String COOKIE_VALUE = "sso";
	public static boolean checkLogin(String username,String password){
		if (USERNAME.equalsIgnoreCase(username)&&PASSWORD.equalsIgnoreCase(password)) {
			return true;
		}
		return false;
	}
	public static boolean  checkCookie(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		if (cookies == null) {
			return false;
		}
		for (Cookie cookie : cookies) {
			if (COOKIE_NAME.equals(cookie.getName())&&COOKIE_VALUE.equals(cookie.getValue())) {
				return true;
			}
		}
		return false;
	}
}
