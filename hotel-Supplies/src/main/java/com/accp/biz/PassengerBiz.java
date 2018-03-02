package com.accp.biz;

import com.accp.entity.Pager;
import com.accp.entity.Passenger;
import org.apache.ibatis.annotations.Param;


public interface PassengerBiz {



    /**
     *  删除旅客
     * @param pId
     * @return
     */
    int delete(String[] pId);


    /**
     * 根据ID查询旅客
     * @param pId
     * @return
     */
    Passenger queryPassengerId(@Param("pId") int pId);

    /**
     * 修改旅客
     * @param passenger
     * @return
     */
    Integer update(Passenger passenger);
    /**
     * 新增旅客
     * @param passenger
     * @return
     */
    int add(Passenger passenger);

    /**
     * 分页查询$$模糊查询
     * @param pager
     */
    void listPage(Pager<Passenger> pager);
}
