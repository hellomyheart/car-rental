package cn.hellomyheart.car.rental.service;

import cn.hellomyheart.car.rental.entity.SysOrder;
public interface SysOrderService{


    int deleteByPrimaryKey(Integer id);

    int insert(SysOrder record);

    int insertSelective(SysOrder record);

    SysOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysOrder record);

    int updateByPrimaryKey(SysOrder record);

}
