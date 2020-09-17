package cn.hellomyheart.car.rental.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.car.rental.entity.User;
import cn.hellomyheart.car.rental.dao.UserMapper;
import cn.hellomyheart.car.rental.service.UserService;
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public User login(String tel, String password) {
        User user = userMapper.selectByTel(tel);
        if (user ==null)
            throw new RuntimeException("账户不存在,请检查手机号!");
        if (!user.getPassword().equals(password))
            throw new RuntimeException("密码错误,请检查密码!");
        return user;
    }
}
