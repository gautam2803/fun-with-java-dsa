public class sumOfTwoArray {

    public static void arrayDigitsSum(int arr1[], int arr2[], int result[]) {
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = result.length-1;
        int carry = 0;

        while(k >= 0) {
            int d = carry;

            if(i >= 0) {
                d += arr1[i];
            } 

            if(j >= 0) {
                d += arr2[j];
            }

            carry = d / 10;
            d = d % 10;
            result[k] = d;
            i--;
            j--;
            k--;

        }
        if(carry != 0) {
            System.out.println(carry);
        }

        for (int val : result) {
            System.out.println(val);
        }
        
        
    }
    public static void main(String[] args) {
        int arr1[] = {2, 5, 2, 8, 9};
        int arr2[] = {9, 8, 2, 3 , 3, 9};
        int n = Math.max(arr1.length, arr2.length);
        int result[] = new int[n];
        arrayDigitsSum(arr1, arr2, result);
    }
}
