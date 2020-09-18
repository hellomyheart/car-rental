package cn.hellomyheart.car.rental.service;

import cn.hellomyheart.car.rental.entity.Order;

import java.util.List;

public interface OrderService {


    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<Order> selectByUid(Integer uid,Integer page,Integer limit);

}
