package com.qingfeng.test.entity;

public class Sfx {

    private Double yse;

    private String ywh;

    public Sfx(Double yse) {
        this.yse = yse;
    }
    public Sfx(Double yse, String ywh) {
        this.yse = yse;
        this.ywh = ywh;
    }

    public Sfx() {
    }

    public Double getYse() {
        return yse;
    }

    public void setYse(Double yse) {
        this.yse = yse;
    }

    public String getYwh() {
        return ywh;
    }

    public void setYwh(String ywh) {
        this.ywh = ywh;
    }
}
