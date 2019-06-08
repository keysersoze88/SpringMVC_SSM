package cn.springmvc.controller;

import cn.springmvc.entity.Userinfo;
import cn.springmvc.service.UserinfoService;
import cn.springmvc.util.Encryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class userController {
    @Autowired
    private UserinfoService userService;

    @RequestMapping(value = "/user/register",method = RequestMethod.GET)
    public String register(){
        return "register";
    }

    @RequestMapping(value = "user/register",method = RequestMethod.POST)
    public String addUser(@ModelAttribute Userinfo user, Model model){
        Userinfo recoed = new Userinfo();
        recoed.setName(user.getName());
        if (userService.selectSelective(recoed) == 0) {
            user.setPassword(Encryption.MD5(user.getPassword()));
            if (userService.insert(user) == 1) {
                model.addAttribute("status", 0);
            } else {
                model.addAttribute("status", 1);
            }
        }else{
            model.addAttribute("status", 2);
        }
        return "register";
    }

    @RequestMapping(value="/user/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public String loginValidate(HttpSession session, Model model, @ModelAttribute Userinfo user) {
        Userinfo record  = new Userinfo();
        record.setName(user.getName());
        if (userService.selectSelective(record) == 0) {
            model.addAttribute("status", 1);
        } else {
            record.setPassword(Encryption.MD5(user.getPassword()));
            if (userService.selectSelective(record) == 0) {
                model.addAttribute("status", 2);
            }else{
                session.setAttribute("userinfo", record);
                model.addAttribute("status", 0);
            }
        }

        return "login";
    }

    @RequestMapping(value="/user/userinfo", method = RequestMethod.GET)
    public String userInfo(Model model, HttpSession session) {
        Userinfo user = (Userinfo) session.getAttribute("userinfo");
        if(user != null){
            model.addAttribute("user", user);
        }

        return "userinfo";
    }

    @RequestMapping(value="/user/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.invalidate();

        return "login";
    }


}
