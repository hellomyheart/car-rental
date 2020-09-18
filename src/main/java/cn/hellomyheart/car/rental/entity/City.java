package cn.hellomyheart.car.rental.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class City implements Serializable {
    private Integer id;

    private String name;

    private Integer pid;

    private static final long serialVersionUID = 1L;
}