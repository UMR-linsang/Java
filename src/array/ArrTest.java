package array;

/**
 * @author Linsang
 * @date 2022/11/25 16:50
 */
public class ArrTest {
    public static void main(String[] args) {
        /*
          获取arr数组中所有元素的和
         */
        int[][] arr = new int[][]{{3,5,8},{12,9},{7,0,6,4}};
        int sum=0;
        for (int[] ints :arr){
            for (int anInt:ints){
                sum+=anInt;
            }
        }
        System.out.println(sum);
    }
}
