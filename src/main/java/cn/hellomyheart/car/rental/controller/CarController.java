package cn.hellomyheart.car.rental.controller;

import cn.hellomyheart.car.rental.common.result.JsonResult;
import cn.hellomyheart.car.rental.common.result.ResultCode;
import cn.hellomyheart.car.rental.entity.Car;
import cn.hellomyheart.car.rental.entity.City;
import cn.hellomyheart.car.rental.service.CarService;
import cn.hellomyheart.car.rental.utils.StrUtils;
import cn.hellomyheart.car.rental.common.result.TableResult;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @description 汽车控制器
 * @className: CarController
 * @package: cn.hellomyheart.car.rental.controller
 * @author: Stephen Shen
 * @date: 2020/9/18 下午1:46
 */
@Controller
@RequestMapping("/car")
@ResponseBody
public class CarController {

    @Autowired
    CarService carService;

    /**
     * 获取汽车列表
     *
     * @param session
     * @param page
     * @param limit
     * @return
     */
    @GetMapping("/list.do")
    public TableResult list(HttpSession session, Integer page, Integer limit) {

        City[][] citys = (City[][]) session.getAttribute(StrUtils.CITYS);

        List<Car> cars = carService.selectByCityId(citys[0][1].getId(), page, limit);

        long total = ((Page) cars).getTotal();
        TableResult tableResult = new TableResult();
        tableResult.setCode(0);
        tableResult.setMsg("");
        tableResult.setCount(total);
        tableResult.setData(cars);

        return tableResult;
    }


    /**
     * 获取汽车详情
     *
     * @param id
     * @return
     */
    @GetMapping("/find.do")
    public JsonResult findCar(Integer id) {

        Car car = carService.selectByPrimaryKey(id);

        return new JsonResult(ResultCode.OK, car);
    }


}
