package cn.hellomyheart.car.rental.service.impl;

import cn.hellomyheart.car.rental.common.service.BaseService;
import cn.hellomyheart.car.rental.common.service.BaseServiceImpl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.hellomyheart.car.rental.entity.User;
import cn.hellomyheart.car.rental.mapper.UserMapper;
import cn.hellomyheart.car.rental.service.UserService;
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper,User> implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public User login(String tel, String password) {
        User user = userMapper.selectByTel(tel);
        if (user ==null)
            throw new RuntimeException("账户不存在,请检查手机号!");
        if (!user.getPassword().equals(password))
            throw new RuntimeException("密码错误,请检查密码!");
        return user;
    }


    @Override
    public int insert(User record) {
        User user = userMapper.selectByTel(record.getTel());
        if (user != null) {
            throw new  RuntimeException("账号已存在,请登录!");
        }
        return super.insert(record);
    }
}
