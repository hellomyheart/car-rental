package cn.hellomyheart.car.rental.service;

import cn.hellomyheart.car.rental.entity.User;
public interface UserService {


    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User login(String tel,String password);

}
