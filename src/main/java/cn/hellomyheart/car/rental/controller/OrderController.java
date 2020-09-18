package cn.hellomyheart.car.rental.controller;

import cn.hellomyheart.car.rental.common.JsonResult;
import cn.hellomyheart.car.rental.entity.City;
import cn.hellomyheart.car.rental.entity.Order;
import cn.hellomyheart.car.rental.entity.User;
import cn.hellomyheart.car.rental.service.OrderService;
import cn.hellomyheart.car.rental.utils.StrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @description 订单控制器
 * @className: OrderController
 * @package: cn.hellomyheart.car.rental.controller
 * @author: Stephen Shen
 * @date: 2020/9/18 下午3:51
 */
@Controller()
@RequestMapping("/order")
@ResponseBody
public class OrderController {

    @Autowired
    OrderService orderService;
    @RequestMapping("/add.do")
    public JsonResult add(Integer id, Integer oprice, HttpSession session){
        User user = (User)session.getAttribute(StrUtils.LOGIN_USER);
        if (user ==null){
            return new JsonResult(0,"未登录");
        }

        City[][] citys= (City[][]) session.getAttribute(StrUtils.CITYS);
        Order order = new Order();
        order.setCid(id);
        order.setUid(user.getId());
        order.setGetid(citys[0][1].getId());
        order.setBackid(citys[1][1].getId());
        order.setOprice(oprice.doubleValue());
        order.setStatus(StrUtils.RESERVED);
        orderService.insert(order);
        return new JsonResult(1,"预定成功");
    }
}
