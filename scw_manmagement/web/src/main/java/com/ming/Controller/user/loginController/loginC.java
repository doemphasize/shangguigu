package com.ming.Controller.user.loginController;

import Utils.Md5Utils;
import bean.TUser;
import com.ming.scw.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class loginC {
    @Autowired
    UserSerivce userSerivce;
    @RequestMapping("/first")
    public String login(TUser user, HttpSession session){
        String digest = Md5Utils.digest(user.getUserpswd());
        user.setUserpswd(digest);
        TUser login = userSerivce.login(user);
        session.setAttribute("username",login.getUsername());
        System.out.println(login);
        return "main";
    }
}
