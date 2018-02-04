package com.yineng.main;

import java.io.Serializable;

/**
 * @author luoqiang
 * @data 2017/06/22
 */
public class JsonBean implements Serializable {

    private static final long serialVersionUID = -2507071792164757167L;

    /** 异常提示信息. */
    private String message;

    /** 状态. */
    private int status;

    /** 结果对象. */
    private Object result;

    public JsonBean() {
    }

    public JsonBean(Object result) {
        this.result = result;
    }

    public JsonBean(String message, int status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
