package com.qingfeng.designpattern.iterator.instance;

public class PayModel {

    /**
     * 员工姓名
     */
    private String userName;

    /**
     * 工资
     */
    private double pay;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getPay() {
        return pay;
    }

    public PayModel(){

    }

    public PayModel(String userName, double pay){
        this.userName = userName;
        this.pay = pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "PayModel{" +
                "userName='" + userName + '\'' +
                ", pay=" + pay +
                '}';
    }
}
