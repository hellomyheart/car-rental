package cn.hellomyheart.car.rental.mapper;

import cn.hellomyheart.car.rental.common.mapper.BaseMapper;
import cn.hellomyheart.car.rental.entity.Car;

import java.util.List;

public interface CarMapper extends BaseMapper<Car> {

    List<Car> selectByCityId(Integer cid);
}