package array;

/**
 * @author Linsang
 * @date 2022/11/25 16:22
 */
public class Arr {
    public static void main(String[] args) {
        //一维数组初始化的两种方式
        int[] arr = new int[5];//动态初始化
        String[] arr1 = new String[]{"Tom", "Jerry", "Jim"};//静态初始化
        /**
         * 数组一旦初始化，其长度就是确定的。arr.length
         * 数组长度一旦确定，就不可修改
         */

        //二维数组初始化的两种方式
        int[][] arr2 = new int[4][3];//动态初始化1
        int[][] arr3 = new int[4][];//动态初始化2

        int[][] arr4 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8}};//静态初始化

        //遍历二维数组
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("===========================");
        //遍历二维 数组
        for (int[] ints : arr4) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }


}


