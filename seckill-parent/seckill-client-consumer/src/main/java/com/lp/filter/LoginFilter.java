package com.lp.filter;


import com.lp.utils.CookieUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedHashMap;

@WebFilter(filterName = "RunNO2", urlPatterns = {"/userHome","/goods/*","/view/*","/page/*","/order/*","/message/*"})
public class LoginFilter implements Filter {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse rep = (HttpServletResponse) servletResponse;

        //检查是否登录，用redis检查，没有登录重定向到登陆页面
        String token = CookieUtils.getCookieValue(req, "TT_TOKEN");
        if (token == null || token.equals("")) {
            rep.sendRedirect("/");
        } else {
            Object obj = this.redisTemplate.opsForValue().get(token);
            if (obj == null) {
                rep.sendRedirect("/");
            }
            //返回用户名和id
            LinkedHashMap<String, String> hashMap = (LinkedHashMap) obj;
            if (hashMap.containsKey("nickname")){
                req.setAttribute("username", hashMap.get("nickname"));
                req.setAttribute("userId", hashMap.get("id"));
            }else {
                req.setAttribute("username", "root");
                req.setAttribute("userId", 1);
            }
        }
        //已登录放行
        filterChain.doFilter(req, rep);
    }

}
