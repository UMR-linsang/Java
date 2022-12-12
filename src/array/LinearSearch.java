package array;

/**
 * @author Linsang
 * @date 2022/12/05 10:34
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{34, 5, 22, -98, 6, -76, 0, -3};
        int dest = 22;
        boolean isFlag = true;
        for (int i = 0; i < arr.length; i++) {
            if (dest == arr[i]) {
                System.out.println(i);
                isFlag = false;
                break;
            }
        }
        if (isFlag) {
            System.out.println("未找到");
        }
    }


}
