package com.luffyjet.gweb.model;

import com.alibaba.fastjson.JSON;

/**
 * Title :
 * Author : luffyjet
 * Date : 2017/5/17
 * Project : gweb001
 * Site : http://www.luffyjet.com
 */
public class BaseResult {
    private boolean result;
    private String msg;
    private Object data;

    public BaseResult() {
    }

    public BaseResult(boolean b) {
        this(b, null, null);
    }

    public BaseResult(Object object) {
        this(true, null, object);
    }

    public BaseResult(boolean b, String message) {
        this(b, message, null);
    }

    public BaseResult(boolean b, String message, Object object) {
        result = b;
        msg = message;
        data = object;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String toJSON() {
        return JSON.toJSONString(this);
    }

    @Override
    public String toString() {
        return toJSON();
    }
}
