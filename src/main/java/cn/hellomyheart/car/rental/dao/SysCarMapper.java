package cn.hellomyheart.car.rental.dao;

import cn.hellomyheart.car.rental.entity.SysCar;

public interface SysCarMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysCar record);

    int insertSelective(SysCar record);

    SysCar selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysCar record);

    int updateByPrimaryKey(SysCar record);
}