package com.van.designpattern.策略模式;

import lombok.Data;

public enum TypeEnum {
    UP_TO_300_RETURN_30(1, "满300减30"),
    NORMAL(2, "无任何优惠"),
    DISCOUNT_7(3, "7折优惠"),
    BUY_2_RETURN_1(4, "买二送一"),

    ;


    TypeEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    private Integer type;
    private String desc;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
