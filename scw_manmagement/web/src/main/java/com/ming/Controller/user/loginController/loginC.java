package com.ming.Controller.user.loginController;

import Utils.Md5Utils;
import bean.TUser;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ming.scw.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

        return "redirect:/main.html";
    }
    @RequestMapping("/permission/user")
    public String usermanage(@RequestParam(value = "pn",defaultValue ="1")Integer pn, @RequestParam(value = "size",defaultValue = "5")Integer size, Model model){

//        到第几页，每一页有多少个
        PageHelper.startPage(pn,size);
        List<TUser> getall = userSerivce.getall();
//分页。连续显示5页
        PageInfo<TUser> Info = new PageInfo(getall, 5);
        System.out.println(Info);
        model.addAttribute("user_info",Info);


        return "manange/user";
    }
}
