package com.lp.mapper;

import com.lp.pojo.MessageUser;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MessageMapper {

    @Results(value = {
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "miaoshaMessage", column = "messageid", one = @One(select = "com.lp.mapper.messageSecKillMapper.selByMessageId")),
    })
    @Select("select * from miaosha_message_user where userid=#{id}")
    List<MessageUser> selByUserId(long id);

}
