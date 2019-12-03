package com.zking.oa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.mvc.method.annotation.SessionAttributeMethodArgumentResolver;

import javax.servlet.http.HttpSession;
import java.util.Locale;

@Controller
public class Il8nController {

@RequestMapping("/Ii8n/{language}")
    public String changeIl8n(@PathVariable("language") String language, HttpSession session) {
    if("zh".equals(language)){
        session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.CHINA);
    }else if("en".equals(language)){
        session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.US);
    }


        return "main";
    }
}
