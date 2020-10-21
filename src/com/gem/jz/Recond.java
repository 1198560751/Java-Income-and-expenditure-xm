package com.gem.jz;

public class Recond {
    private static int bianhao = 1;//利用静态变量实现每次创建id+1
    private int id;//收支的编号
    private String state; //用于判断是收入/支出状态
    private double money = 10000; //账户余额初始值
    private double statemoney; //收支金额
    private String shuoming; //说明

    {
        this.id = bianhao++;

    }

    //自定义构造方法
    public Recond(double money2, String shuoming2, String state2) {
        // TODO Auto-generated constructor stub
        this.statemoney = money2;
        this.shuoming = shuoming2;
        this.state = state2;
    }

    public void showlist() {
        System.out.println(
                this.id + "\t" + this.state + "\t" + this.money + "\t" + this.statemoney + "\t" + this.shuoming);
    }

    public static int getBianhao() {
        return bianhao;
    }

    public static void setBianhao(int bianhao) {
        Recond.bianhao = bianhao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getStatemoney() {
        return statemoney;
    }

    public void setStatemoney(double statemoney) {
        this.statemoney = statemoney;
    }

    public String getShuoming() {
        return shuoming;
    }

    public void setShuoming(String shuoming) {
        this.shuoming = shuoming;
    }

}
