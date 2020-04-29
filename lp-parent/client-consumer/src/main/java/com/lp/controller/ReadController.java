package com.lp.controller;

import com.lp.redis.RedisTime;
import com.lp.utils.CookieUtils;
import com.lp.utils.IDUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping("/read")
public class ReadController {
    private String loginKey = "Read_TOKEN:";

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @RequestMapping({"/", ""})
    public String index(){
        return "read";
    }

    @RequestMapping("/login")
    public String login(String password, HttpServletRequest req, HttpServletResponse rep){
        String pass = "FG1g%6t@[+8";
        if (pass.equals(password)) {
            String cookiesId = loginKey + IDUtils.getRandomUUId();
            this.redisTemplate.opsForValue().set(cookiesId, pass, RedisTime.LOGIN_TIME, TimeUnit.SECONDS);
            CookieUtils.setCookie(req, rep, "Read_TOKEN", cookiesId, (int) RedisTime.LOGIN_TIME);

            return "redirect:/home";
        }

        return "readError";
    }
}
