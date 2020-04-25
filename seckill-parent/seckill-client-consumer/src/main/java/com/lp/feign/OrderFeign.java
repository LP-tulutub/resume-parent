package com.lp.feign;

import com.lp.feign.fallback.OrderFeignFallback;
import com.lp.pojo.OrderInfo;
import com.lp.pojo.OrderInfoGoods;
import com.lp.result.ResultGeekQ;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "seckill-order-producer", fallback = OrderFeignFallback.class)
public interface OrderFeign {

    @RequestMapping("/order/selByUserId/{page}/{rows}/{id]")
    ResultGeekQ<List<OrderInfo>> selByUserId(@PathVariable int page, @PathVariable int rows, @PathVariable long id);

    @RequestMapping("/order/selGoodsOrderInfoByUserId/{page}/{rows}/{id}")
    ResultGeekQ<List<OrderInfoGoods>> selGoodsOrderInfoByUserId(@PathVariable int page, @PathVariable int rows, @PathVariable long id);

}
