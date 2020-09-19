package cn.hellomyheart.car.rental.service;

import cn.hellomyheart.car.rental.common.service.BaseService;
import cn.hellomyheart.car.rental.entity.City;

import java.util.List;

public interface CityService extends BaseService<City> {

    List<City> selectAll(Integer pid);

}
