package com.lp.mapper;

import com.lp.pojo.OrderInfoGoods;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface GoodsOrderInfoMapper {

    @Results(value = {
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "goodsId", column = "goods_id"),
            @Result(property = "goods", column = "goods_id", one = @One(select = "com.lp.mapper.GoodsMapper.selectByPrimaryKey"))
    })
    @Select("select * from order_info where user_id=#{id}")
    List<OrderInfoGoods> selGoodsOrderInfoByUserId(long id);

}
