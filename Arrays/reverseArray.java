public class reverseArray {

    //sabse pehli and nigga vali approach

    /*
    static int[] revArray(int array[]) {
        int size = array.length;
        int reversedArray[] = new int[size];
        for(int i = array.length-1, j = 0; i>-1; i--, j++){
            reversedArray[j] = array[i];
        }
        
        return reversedArray;
    }
    */
    
    //optimised version can be

    static void revArray(int array[]) {
        int start = 0, end = array.length-1;

        while(start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};
    
        //Sabse pehli approach
        /*
        int reversedarray[] = revArray(array);
        System.out.println(reversedarray.length);
        for(int i=0; i<reversedarray.length; i++) {
            System.out.print(reversedarray[i] + " ");
        }

        --> It was taking O(n) time as well space
        */
    
        System.out.print("Original array : ");
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        revArray(array);

        System.out.print("reversed array : ");
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
