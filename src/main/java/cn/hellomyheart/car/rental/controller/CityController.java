package cn.hellomyheart.car.rental.controller;

import cn.hellomyheart.car.rental.common.JsonResult;
import cn.hellomyheart.car.rental.entity.City;
import cn.hellomyheart.car.rental.service.CityService;
import cn.hellomyheart.car.rental.utils.StrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("/setLists.do")
    public JsonResult setLists(HttpSession session,Integer city1, Integer region1 , Integer city2, Integer region2){
        int temp =city1*city2*region1*region2;
        if ( temp==0){
            return new  JsonResult(1,"请先选择城市");
        }
        City [][] citys=new City[2][2];
        citys[0][0] = cityService.selectByPrimaryKey(city1);
        citys[0][1] = cityService.selectByPrimaryKey(region1);
        citys[1][0] = cityService.selectByPrimaryKey(city2);
        citys[1][1] = cityService.selectByPrimaryKey(region2);

        session.setAttribute(StrUtils.CITYS,citys);

        return new JsonResult(1,"success");
    }

    @PostMapping("/getLists.do")
    public JsonResult getLists(HttpSession session){
        City [][] citys= (City[][]) session.getAttribute(StrUtils.CITYS);

        if (citys==null)
            return new JsonResult(0,"未选择城市");
        return new JsonResult(1,citys);
    }



}
