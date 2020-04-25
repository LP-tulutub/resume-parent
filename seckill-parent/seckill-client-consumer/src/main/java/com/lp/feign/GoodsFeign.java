package com.lp.feign;

import com.lp.feign.fallback.GoodsFeignFallback;
import com.lp.pojo.Goods;
import com.lp.pojo.GoodsSecKill;
import com.lp.result.ResultGeekQ;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "seckill-goods-producer", fallback = GoodsFeignFallback.class)
public interface GoodsFeign {

    @RequestMapping("/goods/selAllByPage/{page}/{rows}")
    ResultGeekQ<List<Goods>> selAllByPage(@PathVariable int page, @PathVariable int rows);

    @RequestMapping("/goods/selGoodsSecKillByPage/{page}/{rows}")
    ResultGeekQ<List<GoodsSecKill>> selGoodsSecKillByPage(@PathVariable int page, @PathVariable int rows);

    @RequestMapping("/goods/selGoodsSecKillById/{id}")
    ResultGeekQ<GoodsSecKill> selGoodsSecKillById(@PathVariable int id);
}
