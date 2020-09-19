package cn.hellomyheart.car.rental.common.result;

import lombok.Data;

@Data
public class JsonResult {
    private int code;
    private Object info;


    public JsonResult() {
    }

    public JsonResult(int code, Object info) {
        this.code = code;
        this.info = info;
    }
}
