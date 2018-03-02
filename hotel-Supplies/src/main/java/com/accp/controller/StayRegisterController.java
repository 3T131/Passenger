package com.accp.controller;

import com.accp.biz.AttributeDetailsBiz;
import com.accp.biz.StayRegisterBiz;
import com.accp.entity.AttributeDetails;
import com.accp.entity.Pager;
import com.accp.entity.Passenger;
import com.accp.entity.StayRegister;
import com.sun.tracing.dtrace.ModuleAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/StayRegister")
public class StayRegisterController {
    @Resource
    private StayRegisterBiz stayRegisterBiz;

    @Resource
    private AttributeDetailsBiz attributeDetailsBiz;

    /**
     * 查询，分页查询
     * @param model
     * @param stayRegister
     * @param currentPage
     * @return
     */

    @RequestMapping("/tolist.do")
    public String list(Model model
                     , @ModelAttribute("stayRegister") StayRegister stayRegister
                ,@RequestParam(name = "currentPage",defaultValue = "1")Integer currentPage
                ){
        Pager<StayRegister> pager=new Pager<StayRegister>();//创建分页对象
        pager.setPageNo(currentPage);//设置当前页
        pager.setPageSize(5);//设置页面大小
        pager.setParams(stayRegister);//设置参数
        stayRegisterBiz.listByParam(pager);//调用biz的方法

        List<AttributeDetails> attributeDetailsList = attributeDetailsBiz.listByAttributeName(17);
        model.addAttribute("listOne",attributeDetailsList);
        model.addAttribute("pager",pager);
        return "stayregister/list";
    }

}
