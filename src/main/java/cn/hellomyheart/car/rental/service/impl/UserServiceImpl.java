package cn.hellomyheart.car.rental.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.car.rental.entity.User;
import cn.hellomyheart.car.rental.dao.UserMapper;
import cn.hellomyheart.car.rental.service.UserService;
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper sysUserMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sysUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return sysUserMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return sysUserMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return sysUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return sysUserMapper.updateByPrimaryKey(record);
    }

}
