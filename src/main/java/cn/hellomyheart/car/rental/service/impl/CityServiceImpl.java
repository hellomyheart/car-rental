package cn.hellomyheart.car.rental.service.impl;

import cn.hellomyheart.car.rental.common.service.BaseServiceImpl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.car.rental.mapper.CityMapper;
import cn.hellomyheart.car.rental.entity.City;
import cn.hellomyheart.car.rental.service.CityService;

import java.util.List;

@Service
public class CityServiceImpl extends BaseServiceImpl<CityMapper,City> implements CityService {

    @Resource
    private CityMapper cityMapper;

    @Override
    public List<City> selectAll(Integer pid) {
        return cityMapper.selectAll(pid);
    }
}
