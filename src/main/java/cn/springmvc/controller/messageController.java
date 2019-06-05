package cn.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class messageController {
    @RequestMapping("/message/go")
    public String goTest(){
        return "reach";
    }

    @RequestMapping("/message/detail/data={uname}")
    public String goDetail(@PathVariable("uname")String data, Model model){
        model.addAttribute("data",data);
        return "detail";
    }
}
