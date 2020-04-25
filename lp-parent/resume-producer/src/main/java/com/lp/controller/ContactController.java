package com.lp.controller;

import com.lp.mapper.LpContactMapper;
import com.lp.pojo.LpContact;
import com.lp.pojo.LpContactExample;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@Transactional
public class ContactController {
    @Resource
    private LpContactMapper lpContactMapper;

    /**
     * 查询出最新的3条公开建议
     * @return
     */
    @RequestMapping("/resume/findContact")
    public List<LpContact> findContact(){
        LpContactExample lpContactExample = new LpContactExample();
        lpContactExample.setOrderByClause("id asc");
        lpContactExample.createCriteria().andPublicityEqualTo(1);
        List<LpContact> lists = this.lpContactMapper.selectByExample(lpContactExample);
        int size = lists.size();
        return lists.subList(size-3, size);
    }

    /**
     * 新的建议
     * @param lpContact
     * @return
     */
    @RequestMapping("/resume/contact")
    public int contact(@RequestBody LpContact lpContact){
        Date date = new Date();
        List<LpContact> lists = this.lpContactMapper.selectByExample(new LpContactExample());
        lpContact.setId(String.valueOf(lists.size() + 1));
        lpContact.setCreateTime(date);
        lpContact.setUpdateTime(date);

        return this.lpContactMapper.insertSelective(lpContact);
    }


}
