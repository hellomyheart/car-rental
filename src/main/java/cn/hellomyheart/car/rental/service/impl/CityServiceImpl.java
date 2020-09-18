package cn.hellomyheart.car.rental.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.car.rental.mapper.CityMapper;
import cn.hellomyheart.car.rental.entity.City;
import cn.hellomyheart.car.rental.service.CityService;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Resource
    private CityMapper cityMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return cityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(City record) {
        return cityMapper.insert(record);
    }

    @Override
    public int insertSelective(City record) {
        return cityMapper.insertSelective(record);
    }

    @Override
    public City selectByPrimaryKey(Integer id) {
        return cityMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(City record) {
        return cityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(City record) {
        return cityMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<City> selectAll(Integer pid) {
        return cityMapper.selectAll(pid);
    }
}
