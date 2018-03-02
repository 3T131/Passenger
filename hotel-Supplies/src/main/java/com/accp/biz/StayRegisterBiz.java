package com.accp.biz;

import com.accp.entity.Pager;
import com.accp.entity.StayRegister;

import java.util.List;

public interface StayRegisterBiz {
    void listByParam(Pager<StayRegister> pager);
}
