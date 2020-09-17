package cn.hellomyheart.car.rental.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.car.rental.entity.SysCar;
import cn.hellomyheart.car.rental.mapper.SysCarMapper;
import cn.hellomyheart.car.rental.service.SysCarService;
@Service
public class SysCarServiceImpl implements SysCarService{

    @Resource
    private SysCarMapper sysCarMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sysCarMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysCar record) {
        return sysCarMapper.insert(record);
    }

    @Override
    public int insertSelective(SysCar record) {
        return sysCarMapper.insertSelective(record);
    }

    @Override
    public SysCar selectByPrimaryKey(Integer id) {
        return sysCarMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysCar record) {
        return sysCarMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysCar record) {
        return sysCarMapper.updateByPrimaryKey(record);
    }

}
