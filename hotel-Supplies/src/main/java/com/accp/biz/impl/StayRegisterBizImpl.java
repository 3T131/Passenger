package com.accp.biz.impl;

import com.accp.biz.StayRegisterBiz;
import com.accp.dao.StayRegisterDao;
import com.accp.entity.Pager;
import com.accp.entity.StayRegister;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StayRegisterBizImpl implements StayRegisterBiz {

    @Resource
    private StayRegisterDao stayRegisterDao;

    /**
     * 分页查询带参数
     * @param pager
     */
    public void listByParam(Pager<StayRegister> pager) {
        if(pager.getParams().getLvKeLeiXingId()==null){
            pager.getParams().setLvKeLeiXingId(55);
        }
        if(pager.getParams().getIsBillID()==null){
            pager.getParams().setIsBillID(68);
        }
        pager.setTotalRows(stayRegisterDao.totalRow(pager));//设置总行数
        pager.setDatas(stayRegisterDao.listByParam(pager));//查询数据放到pager对象的datas中
    }
}
