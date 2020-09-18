package cn.hellomyheart.car.rental.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.car.rental.entity.Order;
import cn.hellomyheart.car.rental.mapper.OrderMapper;
import cn.hellomyheart.car.rental.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return orderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Order record) {
        return orderMapper.insert(record);
    }

    @Override
    public int insertSelective(Order record) {
        return orderMapper.insertSelective(record);
    }

    @Override
    public Order selectByPrimaryKey(Integer id) {
        return orderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Order record) {
        return orderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Order record) {
        return orderMapper.updateByPrimaryKey(record);
    }

}
