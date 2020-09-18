package cn.hellomyheart.car.rental.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class SysOrder implements Serializable {
    private static final long serialVersionUID = -1445256493502447333L;
    private Integer id;

    private Integer cid;

    private Integer uid;

    private Integer getid;

    private Integer backid;

    private Double oprice;

    private String status;

}