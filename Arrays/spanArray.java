import java.util.*;

public class spanArray {

    public static int calSpan (int array[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<array.length;i++) {
            //calculate minimum value
            if(min > array[i]) {
                min = array[i];
            }
            //calculate maximum value
            if(max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

        return max-min;
    }

    public static void main(String[] args) {
        int array[] = {5,2,8,1,10};
        int span = calSpan(array);
        System.out.println(span);
    }
}    