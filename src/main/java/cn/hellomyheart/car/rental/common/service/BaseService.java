package cn.hellomyheart.car.rental.common.service;

import cn.hellomyheart.car.rental.common.entity.BaseEntity;

/**
 * @description 基础service
 * @className: BaseService
 * @package: cn.hellomyheart.car.rental.common.service
 * @author: Stephen Shen
 * @date: 2020/9/19 上午10:51
 */
public interface BaseService<E extends BaseEntity> {

    int deleteByPrimaryKey(Integer id);

    int insert(E record);

    int insertSelective(E record);

    E selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(E record);

    int updateByPrimaryKey(E record);
}
