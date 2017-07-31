package com.qingke.www.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {

    private static Logger logger = LoggerFactory.getLogger(loginController.class);
    @RequestMapping("login")
    public String login() {
        logger.trace("login controller");
        return "redirect:login.jsp";
    }

}
