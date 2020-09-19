package cn.hellomyheart.car.rental.common.mapper;


import cn.hellomyheart.car.rental.common.entity.BaseEntity;

/**
 * @description 基础mapper
 * @className: BaseMapper
 * @package: cn.hellomyheart.car.rental.common.mapper
 * @author: Stephen Shen
 * @date: 2020/9/19 上午10:55
 */
public interface BaseMapper<E extends BaseEntity> {
    int deleteByPrimaryKey(Integer id);

    int insert(E record);

    int insertSelective(E record);

    E selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(E record);

    int updateByPrimaryKey(E record);
}
