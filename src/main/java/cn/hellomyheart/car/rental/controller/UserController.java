package cn.hellomyheart.car.rental.controller;

import cn.hellomyheart.car.rental.common.JsonResult;
import cn.hellomyheart.car.rental.entity.User;
import cn.hellomyheart.car.rental.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description 用户控制器
 * @className: UserController
 * @package: cn.hellomyheart.car.rental.controller
 * @author: Stephen Shen
 * @date: 2020/9/17 下午2:38
 */
@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register.do")
    public JsonResult registerUser(String tel,String password,String email,String invitation){

        User user = new User();
        user.setTel(tel);
        user.setEmail(email);
        user.setPassword(password);
        user.setInvitation(invitation);
        userService.insert(user);
        User registerUser = userService.selectByPrimaryKey(user.getId());

        return new JsonResult(1,registerUser);
    }

}
