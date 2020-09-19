package cn.hellomyheart.car.rental.controller;

import cn.hellomyheart.car.rental.common.controller.BaseController;
import cn.hellomyheart.car.rental.common.result.JsonResult;
import cn.hellomyheart.car.rental.common.result.ResultCode;
import cn.hellomyheart.car.rental.common.result.ResultMessage;
import cn.hellomyheart.car.rental.entity.User;
import cn.hellomyheart.car.rental.service.UserService;
import cn.hellomyheart.car.rental.utils.StrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

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
public class UserController extends BaseController<UserService, User> {

    @Autowired
    private UserService userService;

    /**
     * 注册
     *
     * @param tel
     * @param password
     * @param email
     * @param invitation
     * @return
     */
    @PostMapping("/register.do")
    public JsonResult registerUser(String tel, String password, String email, String invitation) {


        User user = new User();
        user.setTel(tel);
        user.setEmail(email);
        user.setPassword(password);
        user.setInvitation(invitation);
        userService.insert(user);
        User registerUser = userService.selectByPrimaryKey(user.getId());
        return new JsonResult(ResultCode.OK, registerUser);
    }


    /**
     * 登录
     *
     * @param tel
     * @param password
     * @param session
     * @return
     */
    @PostMapping("/login.do")
    public JsonResult login(String tel, String password, HttpSession session) {
        User loginUser = userService.login(tel, password);
        session.setAttribute(StrUtils.LOGIN_USER, loginUser);
        return new JsonResult(ResultCode.OK, loginUser);
    }

    /**
     * 获取登录用户信息
     *
     * @param session
     * @return
     */
    @GetMapping("/query.do")
    public JsonResult query(HttpSession session) {
        User user = (User) session.getAttribute(StrUtils.LOGIN_USER);
        if (user == null) {
            return new JsonResult(ResultCode.FAIL, ResultMessage.FAIL_MESSAGE);
        }

        return new JsonResult(ResultCode.OK, user);
    }


    /**
     * 更新用户信息
     *
     * @param session
     * @param tel
     * @param email
     * @return
     */
    @PostMapping("/update.do")
    public JsonResult update(HttpSession session, String tel, String email) {
        User user = (User) session.getAttribute(StrUtils.LOGIN_USER);
        user.setTel(tel);
        user.setEmail(email);
        return update(user);
    }

    /**
     * 修改密码
     *
     * @param session
     * @param password
     * @return
     */
    @PostMapping("/modifypassword.do")
    public JsonResult update(HttpSession session, String password) {
        User user = (User) session.getAttribute(StrUtils.LOGIN_USER);
        user.setPassword(password);
        return update(user);
    }

}
