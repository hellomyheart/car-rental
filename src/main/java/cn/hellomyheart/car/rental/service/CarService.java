package cn.hellomyheart.car.rental.service;

import cn.hellomyheart.car.rental.entity.Car;

import java.util.List;

public interface CarService {


    int deleteByPrimaryKey(Integer id);

    int insert(Car record);

    int insertSelective(Car record);

    Car selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);

    List<Car> selectByCityId(Integer cid, Integer page,Integer limit);
}
