package com.sso.demo2;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sso.util.LoginCheck;

@Controller
public class Demo2Controller {
    
    @RequestMapping("/demo2")
    public ModelAndView main(HttpServletRequest request) {
        
        ModelAndView mv = new ModelAndView();
        
        if (LoginCheck.checkCookie(request)) {
            mv.setViewName("demo2");
            return mv;
        }
        mv.addObject("gotoUrl", "/demo1");
        mv.setViewName("login");
        return mv;
    }
}
