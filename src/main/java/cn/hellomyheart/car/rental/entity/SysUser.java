package cn.hellomyheart.car.rental.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class SysUser implements Serializable {
    private Integer id;

    private String tel;

    private String password;

    private String email;

    private String invitation;

    private static final long serialVersionUID = 1L;
}