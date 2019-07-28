package com.ming.Controller.user.regController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserReg {
    @RequestMapping("/reg")
    public String userreg(){
        return "main";
    }
}
