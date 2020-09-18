package cn.hellomyheart.car.rental.mapper;

import cn.hellomyheart.car.rental.entity.City;

import java.util.List;

public interface CityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
    List<City> selectAll(Integer pid);
}