package com.lp.feign.fallback;

import com.lp.feign.MessageFeign;
import com.lp.pojo.MessageUser;
import com.lp.result.ResultGeekQ;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class MessageFeignFallback implements MessageFeign {
    @Override
    public ResultGeekQ<List<MessageUser>> selByUserId(long id) {
        return null;
    }
}
