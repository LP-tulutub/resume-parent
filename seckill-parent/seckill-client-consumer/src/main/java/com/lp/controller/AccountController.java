package com.lp.controller;

import com.lp.feign.AccountFeign;
import com.lp.pojo.Account;
import com.lp.redis.RedisTime;
import com.lp.service.LoginService;
import com.lp.utils.CookieUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Resource
    private AccountFeign accountFeign;
    @Autowired
    private LoginService loginService;

    /**
     * 登陆
     * @param account
     * @param req
     * @param rep
     * @return
     */
    @RequestMapping("/login")
    public String login(Account account, HttpServletRequest req, HttpServletResponse rep){
        Object obj = this.accountFeign.login(account);
        if (obj!=null && !obj.equals("")){
            String cookiesId = this.loginService.setLoginInRedis(obj);
            CookieUtils.setCookie(req, rep, "TT_TOKEN", cookiesId, (int) RedisTime.LOGIN_TIME);

            return "redirect:/goods/to_list";
        }
        return "error";
    }
}
