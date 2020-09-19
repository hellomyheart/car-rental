package cn.hellomyheart.car.rental.service;

import cn.hellomyheart.car.rental.common.service.BaseService;
import cn.hellomyheart.car.rental.entity.Order;

import java.util.List;

public interface OrderService extends BaseService<Order> {

    List<Order> selectByUid(Integer uid, Integer page, Integer limit);

}