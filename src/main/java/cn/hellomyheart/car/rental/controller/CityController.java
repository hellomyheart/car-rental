package cn.hellomyheart.car.rental.controller;

import cn.hellomyheart.car.rental.common.JsonResult;
import cn.hellomyheart.car.rental.entity.City;
import cn.hellomyheart.car.rental.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @description 城市列表控制器
 * @className: CityController
 * @package: cn.hellomyheart.car.rental.controller
 * @author: Stephen Shen
 * @date: 2020/9/17 下午7:20
 */
@Controller
@ResponseBody
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/list.do")
    public JsonResult list(String pid, HttpSession session){
        if (pid==null){
            pid = "0";
        }
        int nPid =Integer.parseInt(pid);
        List<City> cities = cityService.selectAll(nPid);
        return new JsonResult(1,cities);
    }
}
