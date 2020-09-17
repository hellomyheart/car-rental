package cn.hellomyheart.car.rental.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class SysCar implements Serializable {
    private Integer id;

    private String name;

    private String type;

    private Integer sitnum;

    private Integer cid;

    private Double price;

    private Integer number;

    private String picture;

    private static final long serialVersionUID = 1L;
}