package com.hts.test.designpattern.basetest.enumtest;

public enum  ColorEnum {

    RED("红色",1),
    GREEN("绿色",2);

    private String color;

    private Integer code;

    ColorEnum(String color,Integer code){
        this.color = color;
        this.code = code;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
