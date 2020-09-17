package cn.hellomyheart.car.rental.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class SysOrder implements Serializable {
    private Integer id;

    private Integer cid;

    private Integer uid;

    private Integer getid;

    private Integer backid;

    private Double oprice;

    private String status;

    private static final long serialVersionUID = 1L;
}