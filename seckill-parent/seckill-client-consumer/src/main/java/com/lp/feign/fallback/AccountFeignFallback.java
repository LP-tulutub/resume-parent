package com.lp.feign.fallback;

import com.lp.feign.AccountFeign;
import com.lp.pojo.Account;
import com.lp.pojo.MiaoshaUser;
import org.springframework.stereotype.Component;

@Component
public class AccountFeignFallback implements AccountFeign {
    @Override
    public Object login(Account account) {
        return null;
    }

    @Override
    public int register(MiaoshaUser user) {
        return 0;
    }
}
