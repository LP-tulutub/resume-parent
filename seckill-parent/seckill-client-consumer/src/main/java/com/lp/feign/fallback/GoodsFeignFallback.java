package com.lp.feign.fallback;

import com.lp.feign.GoodsFeign;
import com.lp.pojo.Goods;
import com.lp.pojo.GoodsSecKill;
import com.lp.result.ResultGeekQ;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GoodsFeignFallback implements GoodsFeign {
    @Override
    public ResultGeekQ<List<Goods>> selAllByPage(int page, int rows) {
        return null;
    }

    @Override
    public ResultGeekQ<List<GoodsSecKill>> selGoodsSecKillByPage(int page, int rows) {
        return null;
    }

    @Override
    public ResultGeekQ<GoodsSecKill> selGoodsSecKillById(int id) {
        return null;
    }
}
