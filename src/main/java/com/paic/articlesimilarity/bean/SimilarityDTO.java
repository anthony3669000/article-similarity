package com.paic.articlesimilarity.bean;

import com.alibaba.fastjson.JSONObject;

public class SimilarityDTO {
    private String first;
    private String second;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
