public class sumEachSubArray {

    static void subArrays(int[] array) {
        int size = array.length;
        int ts = 0;//total no of subarrays

        for(int start=0; start<size; start++) {
            // System.out.print("{");

            for(int end=start; end<size; end++) {
                // System.out.print("(");

                //print a sub-array
                int sum = 0;  //for taking sum of a subarray

                for(int ele=start; ele<=end; ele++) {
                    System.out.print(array[ele] + " ");
                    sum = sum + array[ele];
                }
                ts++;
                // System.out.print(")");
                System.out.println("-->sum of this subarray : " + sum);
            }
            // System.out.println("}");
            System.out.println();
        }
        System.out.println("\ntotal no of subarrays : " + ts);
        
    }
    public static void main(String[] args) {
        int [] array = {1, 2, -3, 4, 5};
        System.out.print("The array is : ");

        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nThe sub-arrays are : \n");
        subArrays(array);
    }
}
