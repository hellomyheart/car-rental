package cn.hellomyheart.car.rental.mapper;

import cn.hellomyheart.car.rental.common.mapper.BaseMapper;
import cn.hellomyheart.car.rental.entity.User;

public interface UserMapper extends BaseMapper<User> {

    User selectByTel(String tel);
}