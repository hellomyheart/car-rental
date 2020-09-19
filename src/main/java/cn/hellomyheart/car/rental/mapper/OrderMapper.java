package cn.hellomyheart.car.rental.mapper;

import cn.hellomyheart.car.rental.common.mapper.BaseMapper;
import cn.hellomyheart.car.rental.entity.Order;

import java.util.List;

public interface OrderMapper extends BaseMapper<Order> {

    List<Order> selectByUid(Integer uid);
}