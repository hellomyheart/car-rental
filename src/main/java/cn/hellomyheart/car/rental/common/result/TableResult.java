package cn.hellomyheart.car.rental.common.result;

import lombok.Data;

import java.io.Serializable;

/**
 * @description 前端表格vo对象
 * @className: TableResult
 * @package: cn.hellomyheart.car.rental.vo
 * @author: Stephen Shen
 * @date: 2020/9/18 下午2:21
 */
@Data
public class TableResult implements Serializable {
    private static final long serialVersionUID = -1976926844559072187L;

    private Integer code;

    private String msg;

    private Long count;

    private Object data;

}
