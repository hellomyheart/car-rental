package cn.hellomyheart.car.rental.common.controller;

import cn.hellomyheart.car.rental.common.entity.BaseEntity;
import cn.hellomyheart.car.rental.common.mapper.BaseMapper;
import cn.hellomyheart.car.rental.common.result.JsonResult;
import cn.hellomyheart.car.rental.common.result.ResultCode;
import cn.hellomyheart.car.rental.common.result.ResultMessage;
import cn.hellomyheart.car.rental.common.service.BaseService;
import cn.hellomyheart.car.rental.common.service.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @description 基础controller
 * @className: BaseController
 * @package: cn.hellomyheart.car.rental.common.controller
 * @author: Stephen Shen
 * @date: 2020/9/19 上午10:48
 */
@Component
public abstract class BaseController<S extends BaseService, E extends BaseEntity> {


    @Autowired
    private S s;

    /**
     * 添加
     *
     * @param e
     * @param s
     * @return
     */
    public JsonResult add(E e) {
        s.insertSelective(e);
        return new JsonResult(ResultCode.OK, ResultMessage.TRUE_MESSAGE);
    }


    /**
     * 更新
     *
     * @param e
     * @return
     */
    public JsonResult update(E e) {
        s.updateByPrimaryKey(e);
        return new JsonResult(ResultCode.OK, ResultMessage.TRUE_MESSAGE);
    }


    /**
     * 删除
     *
     * @param oId
     * @return
     */
    public JsonResult delete(Integer oId) {
        s.deleteByPrimaryKey(oId);
        return new JsonResult(ResultCode.OK, ResultMessage.TRUE_MESSAGE);
    }

}
