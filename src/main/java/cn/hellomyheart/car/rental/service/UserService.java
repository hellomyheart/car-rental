package cn.hellomyheart.car.rental.service;

import cn.hellomyheart.car.rental.common.service.BaseService;
import cn.hellomyheart.car.rental.entity.User;

public interface UserService extends BaseService<User> {

    User login(String tel, String password);

}
