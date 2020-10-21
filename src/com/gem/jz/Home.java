package com.gem.jz;

public class Home {
    Recond recond[] = new Recond[100];//对象数组
    static int count = 0;//记录长度

    //显示所有信息
    public void shouzhimingxi() {
        System.out.println("--------当前收支明细记录------------------");
        System.out.println("id\t收支\t账户金额\t收支金额\t说     明");

        if (count == 0) {
            System.out.println("暂无信息显示,请重新录入");
            return;
        }

        for (int i = 0; i < count; i++) {
            recond[i].showlist();
        }
        System.out.println("-------------------------------------------");

    }

    //登记收入
    public void dengjishouru(Recond recond) {
        this.recond[this.count++] = recond; //先把键盘录入的数据放到recond[count]里面

        if ((count - 1) == 0) { //如果是第一次等级 那么在初始化money的基础上进行累加
            this.recond[this.count - 1]
                    .setMoney(this.recond[this.count - 1].getMoney() + this.recond[this.count - 1].getStatemoney());
        } else { //如果是第二次之后,那么则在recond对象数组上一次的money基础上进行累加,再赋值给当前的
            this.recond[this.count - 1]
                    .setMoney(this.recond[this.count - 2].getMoney() + this.recond[this.count - 1].getStatemoney());

        }

        System.out.println("登记收入成功");

    }

    //登记支出
    public void dengjizhichu(Recond recond) { //支出原理同收入原理
        this.recond[this.count++] = recond;

        if ((count - 1) == 0) {
            this.recond[this.count - 1]
                    .setMoney(this.recond[this.count - 1].getMoney() - this.recond[this.count - 1].getStatemoney());
        } else {
            this.recond[this.count - 1]
                    .setMoney(this.recond[this.count - 2].getMoney() - this.recond[this.count - 1].getStatemoney());
        }
        System.out.println("登记支出成功");
    }
}
