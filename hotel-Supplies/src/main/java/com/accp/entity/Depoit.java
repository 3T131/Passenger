package com.accp.entity;

import java.util.Date;
/**
 * 押金表
 */
public class Depoit {

    private Integer depoitId;
    private Integer stayRegisterID; //'住宿登记ID',
    private Integer payWayID; //'支付方式ID',
    private Date registerTime; //'登记时间',
    private Float deposit; //'押金',

    public Integer getDepoitId() {
        return depoitId;
    }

    public void setDepoitId(Integer depoitId) {
        this.depoitId = depoitId;
    }

    public Integer getStayRegisterID() {
        return stayRegisterID;
    }

    public void setStayRegisterID(Integer stayRegisterID) {
        this.stayRegisterID = stayRegisterID;
    }

    public Integer getPayWayID() {
        return payWayID;
    }

    public void setPayWayID(Integer payWayID) {
        this.payWayID = payWayID;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Float getDeposit() {
        return deposit;
    }

    public void setDeposit(Float deposit) {
        this.deposit = deposit;
    }




}
