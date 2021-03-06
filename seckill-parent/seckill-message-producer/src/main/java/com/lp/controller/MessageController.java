package com.lp.controller;

import com.lp.enums.ResultStatus;
import com.lp.mapper.MessageMapper;
import com.lp.pojo.MessageUser;
import com.lp.result.ResultGeekQ;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Resource
    private MessageMapper messageMapper;

    @RequestMapping("/selByUserId/{id}")
    public ResultGeekQ<List<MessageUser>> selByUserId(@PathVariable long id){
        List<MessageUser> list = this.messageMapper.selByUserId(id);

        ResultGeekQ<List<MessageUser>> result = ResultGeekQ.build(ResultStatus.SUCCESS.getMessage());
        result.setData(list);

        return result;
    }

}
