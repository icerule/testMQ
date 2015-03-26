package com.cd.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomController {

    @RequestMapping(value="index.do")
    public ModelAndView index(HttpServletRequest request){
        return new ModelAndView("index").addObject("welcome", "welcome to rabbit mq test!");
    }
}
