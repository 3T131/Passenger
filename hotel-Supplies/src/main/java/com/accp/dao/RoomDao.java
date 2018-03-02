package com.accp.dao;

import com.accp.entity.Pager;
import com.accp.entity.Room;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoomDao {

    /**
     * 分页查询&&模糊查询
     * @param pager
     * @return
     */
    List<Room>listPage(Pager<Room> pager);

    /**
     * 查询总行数
     * @param pager
     * @return
     */
    int totalRow(Pager<Room> pager);

    /**
     * 添加客房
     * @param room
     * @return
     */
    int insertRoom(Room room);

    /**
     * 删除客房
     * @param roomId
     * @return
     */
    int deleteRoom(String[] roomId);

    /**
     * 根据id查询客房
     * @param roomId
     * @return
     */
    Room roomById(@Param("roomId")int roomId);

    /**
     * 修改客房
     * @param room
     * @return
     */
    int updateRoom(Room room);
}
