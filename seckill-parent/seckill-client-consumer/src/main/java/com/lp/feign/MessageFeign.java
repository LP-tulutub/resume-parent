package com.lp.feign;

import com.lp.feign.fallback.MessageFeignFallback;
import com.lp.pojo.MessageUser;
import com.lp.result.ResultGeekQ;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "seckill-message-producer", fallback = MessageFeignFallback.class)
public interface MessageFeign {

    @RequestMapping("/message/selByUserId/{id}")
    ResultGeekQ<List<MessageUser>> selByUserId(@PathVariable long id);

}
