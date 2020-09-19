package cn.hellomyheart.car.rental.common.service;

import cn.hellomyheart.car.rental.common.entity.BaseEntity;
import cn.hellomyheart.car.rental.common.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @description 基础service实现类
 * @className: BaseServiceImpl
 * @package: cn.hellomyheart.car.rental.common.service
 * @author: Stephen Shen
 * @date: 2020/9/19 上午11:33
 */
public abstract class BaseServiceImpl<M extends BaseMapper<E>, E extends BaseEntity> implements BaseService<E> {

    @Autowired
    M m;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return m.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(E record) {
        return m.insert(record);
    }

    @Override
    public int insertSelective(E record) {
        return m.insertSelective(record);
    }

    @Override
    public E selectByPrimaryKey(Integer id) {
        return m.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(E record) {
        return m.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(E record) {
        return m.updateByPrimaryKey(record);
    }

}
