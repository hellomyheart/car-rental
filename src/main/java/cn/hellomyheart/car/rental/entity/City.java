package cn.hellomyheart.car.rental.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class City implements Serializable {
    private static final long serialVersionUID = 7136721075274656564L;
    private Integer id;

    private String name;

    private Integer pid;

}