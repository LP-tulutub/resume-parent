package com.lp.feign;

import com.lp.feign.fallbac.ResumeFeignFallback;
import com.lp.pojo.LpContact;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "lp-resume-producer", fallback = ResumeFeignFallback.class)
public interface ResumeFeign {

    @RequestMapping("/resume/findContact")
    List<LpContact> findContact();

    @RequestMapping("/resume/contact")
    int contact(@RequestBody LpContact lpContact);
}
