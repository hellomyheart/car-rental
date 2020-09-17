package cn.hellomyheart.car.rental.service;

import cn.hellomyheart.car.rental.entity.SysCar;
public interface SysCarService{


    int deleteByPrimaryKey(Integer id);

    int insert(SysCar record);

    int insertSelective(SysCar record);

    SysCar selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysCar record);

    int updateByPrimaryKey(SysCar record);

}
