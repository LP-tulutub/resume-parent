package com.lp.feign;

import com.lp.feign.fallback.AccountFeignFallback;
import com.lp.pojo.Account;
import com.lp.pojo.MiaoshaUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "seckill-account-producer", fallback = AccountFeignFallback.class)
public interface AccountFeign {

    @RequestMapping("/account/login")
    Object login(@RequestBody Account account);

    @RequestMapping("/account/register")
    int register(@RequestBody MiaoshaUser user);
}
