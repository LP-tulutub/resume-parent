package com.lp.controller;

import com.lp.feign.ResumeFeign;
import com.lp.pojo.LpContact;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/resume")
public class ResumeController {

    @Resource
    private ResumeFeign resumeFeign;

    @RequestMapping("/contact")
    public String contact(LpContact lpContact){
        int ins = this.resumeFeign.contact(lpContact);
        if (ins == 1){
            return "redirect:/home";
        }else {
            return "redirect:/error/500";
        }
    }
}
