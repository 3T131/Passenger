package com.accp.dao;

import com.accp.entity.AttributeDetails;
import com.accp.entity.Pager;
import com.accp.entity.Passenger;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PassengerDao {


    /**
     * 新增旅客
     * @param passenger
     * @return
     */
    int add(Passenger passenger);

    /*
    * 删除旅客
    * */
    int delete(String[] pId);

    /**
     * 查询要修改的旅客
     * @param pId
     * @return
     */
    Passenger queryPassengerId(@Param("pId")int pId);

    /**
     * 修改旅客
     * @param passenger
     * @return
     */
    Integer update(Passenger passenger);

    /**
     * 分页查询&&模糊查询
     * @param pager
     * @return
     */
    List<Passenger>listPage(Pager<Passenger> pager);

    /**
     * 查询总行数
     * @param pager
     * @return
     */
    int totalRow(Pager<Passenger>pager);
}
