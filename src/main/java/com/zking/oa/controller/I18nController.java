package com.zking.oa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpSession;
import java.util.Locale;

@Controller
public class I18nController{

    @RequestMapping("/i18n/{language}")
    public String changeI18n(@PathVariable("language") String language, HttpSession session){
        if("zh".equals(language)){
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.CHINA);
        }else if("en".equals(language)){
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.US);
        }
        return "main";
    }
}
