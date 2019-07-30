package com.ming.Controller.user.regController;

import bean.TUser;
import com.ming.scw.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserReg {
    @Autowired
    UserSerivce userSerivce;
    @RequestMapping("/reg")
    public String userreg(TUser user, Model model, HttpSession session){
        Boolean register = userSerivce.register(user);
        if (register==true){
            session.setAttribute("username",user.getUsername());
            return "main";
        }else
        {
            model.addAttribute("regError","用户名已经被使用");
            return "forward:/reg.jsp";
        }

    }

}
