package com.ming.Controller;

import bean.Person;
import bean.TUser;
import com.ming.scw.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @Autowired
    UserSerivce userSerivce;
    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "id",defaultValue = "2")Integer id, Model model){
        TUser user = userSerivce.getUserById(id);
        model.addAttribute("user",user);
        return "forward:/success.jsp";
    }

}
