package cn.hellomyheart.car.rental.dao;

import cn.hellomyheart.car.rental.entity.SysCity;

public interface SysCityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysCity record);

    int insertSelective(SysCity record);

    SysCity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysCity record);

    int updateByPrimaryKey(SysCity record);
}