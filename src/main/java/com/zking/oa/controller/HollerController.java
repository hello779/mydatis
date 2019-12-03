package com.zking.oa.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/test")
public class HollerController {

    @RequestMapping("/hello")
    public String Hello(String name, HttpServletRequest request, HttpSession session) {
        System.out.println("hello..."+name+",ts="+System.currentTimeMillis());
        System.out.println("/WEB-INF/jsp/main.jsp");
        request.setAttribute("name",name);

        RequestContext requestContext = new RequestContext(request);
        String hello = requestContext.getMessage("hello.label");

        session.setAttribute("hello",hello);
        return "redirect:/test/toMain";
    }


    @RequestMapping("/toMain")
    public String toMain() {
        return "main";
    }

    @RequestMapping("/add")
    public String add() {
        System.out.println("add.....ts="+System.currentTimeMillis());
        return null;
    }
}
