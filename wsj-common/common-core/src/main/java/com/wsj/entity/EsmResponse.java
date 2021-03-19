package com.wsj.entity;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @Author: wsj
 * @Date: 2021/3/15 20
 * @Description:
 */
public class EsmResponse extends HashMap<String,Object> implements Serializable {
    private static final long serialVersionUID = -2735261232539003750L;

    public EsmResponse message(String message) {
        this.put("message", message);
        return this;
    }

    public EsmResponse data(Object data) {
        this.put("data", data);
        return this;
    }

    @Override
    public EsmResponse put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public String getMessage() {
        return String.valueOf(get("message"));
    }

    public Object getData() {
        return get("data");
    }
}
