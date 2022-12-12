package array;


import java.util.Arrays;

/**
 * @author Linsang
 * @date 2022/12/02 17:30
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{34, 5, 22, -98, 6, -76, 0, -3};
        //冒泡排序 时间复杂度O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr) + " ");


        //快速排序  时间复杂度O(nlogn)
        //堆排序、归并排序


    }
}



