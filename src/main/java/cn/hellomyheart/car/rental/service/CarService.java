package cn.hellomyheart.car.rental.service;

import cn.hellomyheart.car.rental.common.service.BaseService;
import cn.hellomyheart.car.rental.entity.Car;

import java.util.List;

public interface CarService extends BaseService<Car> {

    List<Car> selectByCityId(Integer cid, Integer page, Integer limit);
}
