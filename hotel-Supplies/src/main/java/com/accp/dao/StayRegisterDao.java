package com.accp.dao;

import com.accp.entity.Pager;
import com.accp.entity.StayRegister;

import java.util.List;

public interface StayRegisterDao {

    /**
     * 按参数分页查询
     * @param pager
     * @return
     */
    List<StayRegister> listByParam(Pager<StayRegister> pager);

    /**
     * 查询总行数
     * @param pager
     * @return
     */
    int totalRow(Pager<StayRegister> pager);
}
