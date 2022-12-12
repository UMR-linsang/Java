package array;

/**
 * @author Linsang
 * @date 2022/11/26 13:30
 */

/*
 *
 * 使用二维数组打印一个10行杨辉三角
 * 第一行有1个元素，第n行有n个元素
 * 每一行的第一个和最后一个元素都是1
 *
 * 从第三行开始 ，对于非第一个元素和最后一个元素
 *有：yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
 */
public class YangHui {
    public static void main(String[] args) {
        int[][] yangHui = new int[10][];
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];
            yangHui[i][0] = yangHui[i][i] = 1;
            if (i > 1) {
                for (int j = 1; j < yangHui[i].length - 1; j++)
                    yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
            }
        }
        for (int[] ints : yangHui) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        //int[][] yanghui = new int[10][];
        //for (int i = 0; i < yanghui.length; i++) {
        //    yanghui[i] = new int[i + 1];
        //    yanghui[i][0] = yanghui[i][i] = 1;
        //    if (i > 1) {
        //        for (int j = 1; j < i ; j++) {
        //            yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];
        //        }
        //    }
        //}
        //for (int[] ints : yanghui) {
        //    for (int anInt : ints) {
        //        System.out.print(anInt + " ");
        //    }
        //    System.out.println();
        //}


    }
}

