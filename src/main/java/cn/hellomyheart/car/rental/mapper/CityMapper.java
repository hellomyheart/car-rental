package cn.hellomyheart.car.rental.mapper;

import cn.hellomyheart.car.rental.common.mapper.BaseMapper;
import cn.hellomyheart.car.rental.entity.City;

import java.util.List;

public interface CityMapper extends BaseMapper<City> {

    List<City> selectAll(Integer pid);
}