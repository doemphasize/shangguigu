package com.ming.Controller.user.loginController;

import bean.TUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginC {
    @RequestMapping("/guanli")
    public String login(TUser user){
        System.out.println(user);
        return "main";
    }
}
