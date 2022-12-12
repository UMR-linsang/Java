package ObjectOriented;

/**
 * @author Linsang
 * @description
 * @date 2022/12/11 13:56
 */

/*
 *匿名对象的使用
 * 1.理解：我们创建的对象，没有显式的赋给一个变量名，。即为匿名对象
 * 2.特征：匿名对象只能调用一次。
 */
public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p);//ObjectOriented.Phone@4eec7777
        p.sendEmail();
        p.playGame();
        System.out.println("=========");

        //匿名对象
        new Phone().sendEmail();
        new Phone().playGame();
        System.out.println("==========");

        new Phone().price = 1999;
        new Phone().showPrice();//0.0
        System.out.println("=========");
        PhoneMall mall = new PhoneMall();
        //mall.show(p);
        //匿名对象的使用
        mall.show(new Phone());
    }
}



class PhoneMall{
    public void show(Phone phone){
        phone.sendEmail();
        phone.playGame();
    }
}
class Phone {
    double price;//价格

    public void sendEmail() {
        System.out.println("发送邮件");
    }

    public void playGame() {
        System.out.println("玩游戏");
    }

    public void showPrice() {
        System.out.println("手机的价格为" + price);
    }
}
