package array;

import java.util.Arrays;

/**
 * @author Linsang
 * @date 2022/12/01 14:17
 */

/*
算法的考察：数组的负责、反转、查找（线性查找、二分法查找）
 */
public class ArrayTest {
    public static void main(String[] args) {
        String[] arr = new String[]{"JJ", "DD", "MM", "BB", "GG", "AA"};

        //数组的复制（区别于数组变量的赋值：arr1=arr）
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        //arraycopy()方法
        System.arraycopy(arr, 0, arr1, 0, arr1.length);
        System.out.println(Arrays.toString(arr1));
        /*System.arraycopy的函数原型
         *其中src表示源数组，srcPos表示源数组要复制的起始位置
         *dest表示目标数组，destPos表示复制的起始位置，length表示要复制的长度
         * public static void arraycopy (Object src,int srcPos, Object dest,int destPos, int length)
         */

    }

}
