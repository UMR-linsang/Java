package ObjectOriented;

/**
 * @author Linsang
 * @date 2022/12/05 10:51
 */
/*
 *1.Java类及类的成员:属性、方法、构造器;代码块、内部类
 *2.面向对象的三大特征:封装性、继承性、多态性、(抽象性)
 *3.其他关键字:this、super、static、final、abstract、interface、package、import等
 *
 */

/*
 *
 * 对象数组题目:
 *   定义类Student，包含三个属性: 学号number(int)，年级state(int)，成绩score(int)
 *   创建28个学生对象，学号为1到20，年级和成绩都由随机数确定。
 *   问题一: 打印出3年级(state值为3)的学生信息。
 *   问题二:使用冒泡排序按学生成绩排序，并遍历所有学生信息
 */


public class StudentTest {
    public static void main(String[] args) {
        //声明Student类型的数组
        Student[] stus = new Student[20];

        for (int i = 0; i < stus.length; i++) {
            //给数组元素赋值
            stus[i] = new Student();
            //给Student对象的属性赋值
            stus[i].number = i + 1;
            stus[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            stus[i].score = (int) (Math.random() * (100 - 0 + 1));
        }
        //遍历学生数组
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].info());
        }
        System.out.println("===========");
        //问题一:打印出3年级(state值为3)的学生信息。
        for (int i = 0; i < stus.length; i++) {
            if (stus[i].state == 3) {
                System.out.println(stus[i].info());
            }
        }
        System.out.println("==========");


        //问题二-1:使用冒泡排序按学生成绩排序
        for (int i = 0; i < stus.length-1; i++) {
            for (int j = 0; j < stus.length - i - 1; j++) {
                if (stus[j].score > stus[j + 1].score) {
                    Student temp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = temp;

                }
            }
        }
        //问题二-2:遍历学生数组
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].info());
        }
    }
}

class Student {
    int number;
    int state;
    int score;

    //显示学生信息的方法
    public String info() {
        return "学号:" + number + ",年级:" + state + ",成绩:" + score;
    }
}
