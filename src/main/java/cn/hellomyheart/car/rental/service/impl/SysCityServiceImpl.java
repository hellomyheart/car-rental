package cn.hellomyheart.car.rental.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.car.rental.dao.SysCityMapper;
import cn.hellomyheart.car.rental.entity.SysCity;
import cn.hellomyheart.car.rental.service.SysCityService;
@Service
public class SysCityServiceImpl implements SysCityService{

    @Resource
    private SysCityMapper sysCityMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sysCityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysCity record) {
        return sysCityMapper.insert(record);
    }

    @Override
    public int insertSelective(SysCity record) {
        return sysCityMapper.insertSelective(record);
    }

    @Override
    public SysCity selectByPrimaryKey(Integer id) {
        return sysCityMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysCity record) {
        return sysCityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysCity record) {
        return sysCityMapper.updateByPrimaryKey(record);
    }

}
