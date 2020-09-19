package cn.hellomyheart.car.rental.common.result;

import lombok.Data;

import java.io.Serializable;

@Data
public class JsonResult implements Serializable {

    private static final long serialVersionUID = -8610584267751014757L;
    private int code;
    private Object info;


    public JsonResult() {
    }

    public JsonResult(int code, Object info) {
        this.code = code;
        this.info = info;
    }
}
