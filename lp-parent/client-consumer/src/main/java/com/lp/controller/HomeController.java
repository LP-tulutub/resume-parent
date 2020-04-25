package com.lp.controller;

import com.lp.feign.ResumeFeign;
import com.lp.pojo.LpContact;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class HomeController {

    @Resource
    private ResumeFeign resumeFeign;

    @RequestMapping("/")
    public String welcome(){
        return "redirect:/home";
    }

    @RequestMapping("/home")
    public String home(Model model){
        List<LpContact> list = this.resumeFeign.findContact();
        model.addAttribute("list", list);
        return "index";
    }

    @RequestMapping("/{page}.html")
    public String showPage(@PathVariable String page){
        return page;
    }

}
