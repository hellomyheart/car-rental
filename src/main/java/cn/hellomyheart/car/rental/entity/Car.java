package cn.hellomyheart.car.rental.entity;

import java.io.Serializable;

import cn.hellomyheart.car.rental.common.entity.BaseEntity;
import lombok.Data;

@Data
public class Car implements BaseEntity {
    private static final long serialVersionUID = -5208655836009430455L;
    private Integer id;

    private String name;

    private String type;

    private Integer sitnum;

    private Integer cid;

    private Double price;

    private Integer number;

    private String picture;

}