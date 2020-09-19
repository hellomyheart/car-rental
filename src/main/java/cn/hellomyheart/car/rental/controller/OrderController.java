package cn.hellomyheart.car.rental.controller;

import cn.hellomyheart.car.rental.common.JsonResult;
import cn.hellomyheart.car.rental.common.TableResult;
import cn.hellomyheart.car.rental.entity.City;
import cn.hellomyheart.car.rental.entity.Order;
import cn.hellomyheart.car.rental.entity.User;
import cn.hellomyheart.car.rental.service.OrderService;
import cn.hellomyheart.car.rental.utils.StrUtils;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

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

    /**
     * 添加订单
     *
     * @param id
     * @param oprice
     * @param session
     * @return
     */
    @RequestMapping("/add.do")
    public JsonResult add(Integer id, Integer oprice, HttpSession session) {
        User user = (User) session.getAttribute(StrUtils.LOGIN_USER);
        if (user == null) {
            return new JsonResult(0, "未登录");
        }

        City[][] citys = (City[][]) session.getAttribute(StrUtils.CITYS);
        Order order = new Order();
        order.setCid(id);
        order.setUid(user.getId());
        order.setGetid(citys[0][1].getId());
        order.setBackid(citys[1][1].getId());
        order.setOprice(oprice.doubleValue());
        order.setStatus(StrUtils.RESERVED);
        orderService.insert(order);
        return new JsonResult(1, "预定成功");
    }


    /**
     * 显示订单列表
     *
     * @param session
     * @param page
     * @param limit
     * @return
     */
    @GetMapping("/list.do")
    public TableResult list(HttpSession session, Integer page, Integer limit) {
        User user = (User) session.getAttribute(StrUtils.LOGIN_USER);

        List<Order> orders = orderService.selectByUid(user.getId(), page, limit);
        long total = ((Page) orders).getTotal();
        TableResult tableResult = new TableResult();
        tableResult.setCode(0);
        tableResult.setMsg("");
        tableResult.setCount(total);
        tableResult.setData(orders);
        return tableResult;
    }

    /**
     * 删除订单
     *
     * @param oId
     * @return
     */
    @PostMapping("/delete.do")
    public JsonResult delete(Integer oId) {
        orderService.deleteByPrimaryKey(oId);
        return new JsonResult(1, "删除订单成功");
    }
}
