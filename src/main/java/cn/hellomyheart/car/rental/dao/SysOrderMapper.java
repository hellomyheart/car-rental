package cn.hellomyheart.car.rental.dao;

import cn.hellomyheart.car.rental.entity.SysOrder;

public interface SysOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysOrder record);

    int insertSelective(SysOrder record);

    SysOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysOrder record);

    int updateByPrimaryKey(SysOrder record);
}