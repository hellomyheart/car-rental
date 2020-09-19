package cn.hellomyheart.car.rental.service.impl;

import cn.hellomyheart.car.rental.common.service.BaseServiceImpl;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.car.rental.entity.Car;
import cn.hellomyheart.car.rental.mapper.CarMapper;
import cn.hellomyheart.car.rental.service.CarService;

import java.util.List;

@Service
public class CarServiceImpl extends BaseServiceImpl<CarMapper,Car> implements CarService {

    @Resource
    private CarMapper carMapper;


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
