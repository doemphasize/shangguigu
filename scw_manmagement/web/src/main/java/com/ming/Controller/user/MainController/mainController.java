package com.ming.Controller.user.MainController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class mainController {
    @RequestMapping("/main.html")
    public String d(HttpSession session){
        Object username = session.getAttribute("username");
        if(username!=null)
        return "main";
        else
            return "login";
    }
}
