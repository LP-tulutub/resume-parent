package com.lp.mapper;

import com.lp.pojo.MiaoshaMessage;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface messageSecKillMapper {

    @Select("select * from miaosha_message where messageid=#{messageId}")
    List<MiaoshaMessage> selByMessageId(long messageId);
}
