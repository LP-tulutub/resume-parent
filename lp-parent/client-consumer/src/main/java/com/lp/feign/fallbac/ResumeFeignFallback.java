package com.lp.feign.fallbac;

import com.lp.feign.ResumeFeign;
import com.lp.pojo.LpContact;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ResumeFeignFallback implements ResumeFeign {
    @Override
    public List<LpContact> findContact() {
        return null;
    }

    @Override
    public int contact(LpContact lpContact) {
        return 0;
    }
}
