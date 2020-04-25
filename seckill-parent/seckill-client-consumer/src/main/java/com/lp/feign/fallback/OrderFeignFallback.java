package com.lp.feign.fallback;

import com.lp.feign.OrderFeign;
import com.lp.pojo.OrderInfo;
import com.lp.pojo.OrderInfoGoods;
import com.lp.result.ResultGeekQ;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderFeignFallback implements OrderFeign {
    @Override
    public ResultGeekQ<List<OrderInfo>> selByUserId(int page, int rows, long id) {
        return null;
    }

    @Override
    public ResultGeekQ<List<OrderInfoGoods>> selGoodsOrderInfoByUserId(int page, int rows, long id) {
        return null;
    }
}
