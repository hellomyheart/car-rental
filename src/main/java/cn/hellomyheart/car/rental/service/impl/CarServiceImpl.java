package cn.hellomyheart.car.rental.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.car.rental.entity.Car;
import cn.hellomyheart.car.rental.mapper.CarMapper;
import cn.hellomyheart.car.rental.service.CarService;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Resource
    private CarMapper carMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return carMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Car record) {
        return carMapper.insert(record);
    }

    @Override
    public int insertSelective(Car record) {
        return carMapper.insertSelective(record);
    }

    @Override
    public Car selectByPrimaryKey(Integer id) {
        return carMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Car record) {
        return carMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Car record) {
        return carMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Car> selectByCityId(Integer cid,Integer page,Integer limit) {
        PageHelper.startPage(page,limit);
        List<Car> cars = carMapper.selectByCityId(cid);
        if (cars.size() == 0) {
            throw new RuntimeException("所选区域暂无车辆");
        }
        return cars;
    }
}
