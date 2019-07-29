package com.ming.Controller.user.MainController;

import bean.TPermission;
import com.ming.scw.service.TPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class mainController {
    @Autowired
    TPermissionService pservice;
    @RequestMapping("/main.html")
    public String d(HttpSession session){
        Object username = session.getAttribute("username");
        if(username!=null){
            if(session.getAttribute("menulist")==null){
            List<TPermission> getallmenu = pservice.getallmenu();
            session.setAttribute("menulist",getallmenu);}
            return "main";}
        else
            return "login";
    }
}
