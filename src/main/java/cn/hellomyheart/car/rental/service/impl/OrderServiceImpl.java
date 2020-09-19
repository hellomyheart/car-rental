package cn.hellomyheart.car.rental.service.impl;

import cn.hellomyheart.car.rental.common.service.BaseServiceImpl;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.car.rental.entity.Order;
import cn.hellomyheart.car.rental.mapper.OrderMapper;
import cn.hellomyheart.car.rental.service.OrderService;

import java.util.List;

@Service
public class OrderServiceImpl extends BaseServiceImpl<OrderMapper,Order> implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public List<Order> selectByUid(Integer uid, Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Order> orders = orderMapper.selectByUid(uid);
        return orders;
    }
}
