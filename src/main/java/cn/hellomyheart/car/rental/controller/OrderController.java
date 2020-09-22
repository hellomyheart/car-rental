package cn.hellomyheart.car.rental.controller;

import cn.hellomyheart.car.rental.common.controller.BaseController;
import cn.hellomyheart.car.rental.common.result.JsonResult;
import cn.hellomyheart.car.rental.common.result.ResultCode;
import cn.hellomyheart.car.rental.common.result.ResultMessage;
import cn.hellomyheart.car.rental.common.result.TableResult;
import cn.hellomyheart.car.rental.entity.City;
import cn.hellomyheart.car.rental.entity.Order;
import cn.hellomyheart.car.rental.entity.User;
import cn.hellomyheart.car.rental.service.OrderService;
import cn.hellomyheart.car.rental.utils.StrUtils;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @description 订单控制器
 * @className: OrderController
 * @package: cn.hellomyheart.car.rental.controller
 * @author: Stephen Shen
 * @date: 2020/9/18 下午3:51
 */
@Controller
@RequestMapping("/order")
@ResponseBody
public class OrderController extends BaseController<OrderService,Order>{

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
    @PostMapping("/add.do")
    public JsonResult add(@RequestParam("id") Integer id, @RequestParam("oprice") Integer oprice, HttpSession session) {
        User user = (User) session.getAttribute(StrUtils.LOGIN_USER);
        if (user == null) {
            return new JsonResult(ResultCode.FAIL, ResultMessage.No_LOGIN);
        }

        City[][] citys = (City[][]) session.getAttribute(StrUtils.CITYS);
        Order order = new Order();
        order.setCid(id);
        order.setUid(user.getId());
        order.setGetid(citys[0][1].getId());
        order.setBackid(citys[1][1].getId());
        order.setOprice(oprice.doubleValue());
        order.setStatus(StrUtils.RESERVED);
        return add(order);
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
        return delete(oId);
    }
}
