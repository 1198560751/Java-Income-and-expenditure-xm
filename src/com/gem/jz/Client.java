package com.gem.jz;

import java.util.Scanner;


public class Client {
    public static void main(String[] args) {
        Home home = new Home();//实例化
        Scanner scanner = new Scanner(System.in);
        while (true) { //循环界面功能
            menue(scanner, home); //界面

        }
    }

    private static void menue(Scanner scanner, Home home) {
        System.out.println("-----------家庭收支记账软件---------------");
        System.out.println("1.收支明细");
        System.out.println("2.登记收入");
        System.out.println("3.登记支出");
        System.out.println("4.退出");
        System.out.println("选择(1-4)");
        int choice = Integer.parseInt(scanner.nextLine().trim());
        //选择
        switch (choice) {
            case 1://收支明细
                shouzhi(home);
                break;
            case 2://登记收入
                dengji(scanner, home);
                break;
            case 3://登记支出
                zhichu(scanner, home);
                break;
            case 4://退出
                System.exit(0);
                break;
            default:
                System.out.println("输入出错!");
                break;
        }
    }

    //等级收入
    private static void dengji(Scanner scanner, Home home) {
        // TODO Auto-generated method stub
        System.out.println("选择2:");
        System.out.println("  本次收入金额为:");
        double statemoney = Double.parseDouble(scanner.nextLine().trim());
        System.out.println("本次收入说明");
        String shuoming = scanner.nextLine().trim();
        String state = "收入";
        Recond a1 = new Recond(statemoney, shuoming, state);
        //传递收入金额,收入说明,和判断是"收入"
        home.dengjishouru(a1);
    }

    //等级支出
    private static void zhichu(Scanner scanner, Home home) {
        // TODO Auto-generated method stub
        System.out.println("选择3:");
        System.out.println("  本次支出金额为:");
        double statemoney = Double.parseDouble(scanner.nextLine().trim());
        System.out.println("本次收入说明");
        String shuoming = scanner.nextLine().trim();
        String state = "支出";
        Recond a1 = new Recond(statemoney, shuoming, state);
        home.dengjizhichu(a1);
    }

    //全部收支明细
    private static void shouzhi(Home home) {
        home.shouzhimingxi();
    }
}
