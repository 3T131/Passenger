package com.accp.entity;
import java.util.Date;
/**
 * 消费明细表
 */
public class ConsumptionDetails {

    private Integer consumptionDetailsId; //'消费明细ID',
    private Integer stayRegisterID; //'住宿登记ID',
    private Integer commodityID; //'商品ID',
    private String consumptionNumber; //'消费数量',
    private Float consumptionMoney; //'消费金额',
    private Date consumptionTime; //'消费时间',

    public Integer getConsumptionDetailsId() {
        return consumptionDetailsId;
    }

    public void setConsumptionDetailsId(Integer consumptionDetailsId) {
        this.consumptionDetailsId = consumptionDetailsId;
    }

    public Integer getStayRegisterID() {
        return stayRegisterID;
    }

    public void setStayRegisterID(Integer stayRegisterID) {
        this.stayRegisterID = stayRegisterID;
    }

    public Integer getCommodityID() {
        return commodityID;
    }

    public void setCommodityID(Integer commodityID) {
        this.commodityID = commodityID;
    }

    public String getConsumptionNumber() {
        return consumptionNumber;
    }

    public void setConsumptionNumber(String consumptionNumber) {
        this.consumptionNumber = consumptionNumber;
    }

    public Float getConsumptionMoney() {
        return consumptionMoney;
    }

    public void setConsumptionMoney(Float consumptionMoney) {
        this.consumptionMoney = consumptionMoney;
    }

    public Date getConsumptionTime() {
        return consumptionTime;
    }

    public void setConsumptionTime(Date consumptionTime) {
        this.consumptionTime = consumptionTime;
    }
}
