package cn.hellomyheart.car.rental.service;

import cn.hellomyheart.car.rental.entity.SysUser;
public interface SysUserService{


    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

}
