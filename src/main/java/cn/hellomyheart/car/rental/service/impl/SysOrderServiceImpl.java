package cn.hellomyheart.car.rental.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.car.rental.entity.SysOrder;
import cn.hellomyheart.car.rental.mapper.SysOrderMapper;
import cn.hellomyheart.car.rental.service.SysOrderService;
@Service
public class SysOrderServiceImpl implements SysOrderService{

    @Resource
    private SysOrderMapper sysOrderMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sysOrderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysOrder record) {
        return sysOrderMapper.insert(record);
    }

    @Override
    public int insertSelective(SysOrder record) {
        return sysOrderMapper.insertSelective(record);
    }

    @Override
    public SysOrder selectByPrimaryKey(Integer id) {
        return sysOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysOrder record) {
        return sysOrderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysOrder record) {
        return sysOrderMapper.updateByPrimaryKey(record);
    }

}
