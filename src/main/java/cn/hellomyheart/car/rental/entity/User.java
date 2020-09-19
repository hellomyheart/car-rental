package cn.hellomyheart.car.rental.entity;

import java.io.Serializable;

import cn.hellomyheart.car.rental.common.entity.BaseEntity;
import lombok.Data;

@Data
public class User implements BaseEntity {
    private static final long serialVersionUID = -7573639192659798098L;
    private Integer id;

    private String tel;

    private String password;

    private String email;

    private String invitation;

}