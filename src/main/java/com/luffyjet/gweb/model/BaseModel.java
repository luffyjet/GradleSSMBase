package com.luffyjet.gweb.model;

import com.alibaba.fastjson.JSON;

/**
 * Title :
 * Author : luffyjet
 * Date : 2017/5/18
 * Project : gweb001
 * Site : http://www.luffyjet.com
 */
public class BaseModel {
    public String toJSON() {
        return JSON.toJSONString(this);
    }
}
