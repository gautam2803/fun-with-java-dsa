public class maxSubArraySum {
   /*
    static int maxSum(int[] array) {
        int maxSum = Integer.MIN_VALUE;
        int size = array.length;
        int ts = 0;//total no of subarrays

        for(int start=0; start<size; start++) {
            // System.out.print("{");

            for(int end=start; end<size; end++) {
                // System.out.print("(");

                //print a sub-array
                int sum = 0;  //for taking sum of a subarray

                for(int ele=start; ele<=end; ele++) {
                    // System.out.print(array[ele] + " ");
                    sum = sum + array[ele];
                    
                    //updaing maxSum
                    if(maxSum < sum) {
                        maxSum = sum;
                    }
                }
                ts++;
                // System.out.print(")");
                // System.out.println("-->sum of this subarray : " + sum);
            }
            // System.out.println("}");
            // System.out.println();
        }
        // System.out.println("\ntotal no of subarrays : " + ts);
        return maxSum;
        
    }
    */

    /* 
    //using prefix sum approach -->better than 1
    static int maxSumPrefix(int[] array) {
        int maxSum = Integer.MIN_VALUE;
        int size = array.length;
        int prefix[] = new int[size];
        prefix[0] = array[0];
        //calculate prefix array
        for(int i=1; i<size; i++) {
            prefix[i]  = prefix[i-1] + array[i];
        }
        for(int start=0; start<size; start++) {
            for(int end=start; end<size; end++) {
                int currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1]; 
                //updaing maxSum
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }
    */


    // sabka baap
    //using kadane's algorithm
     static int maxSumKadane(int array[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<array.length; i++) {
            currSum += array[i];
            // if(maxSum < currSum) {
            //     maxSum = currSum;
            // }
            maxSum = Math.max(maxSum, currSum);
            if(currSum < 0) {
                currSum = 0;
            } 

        }

        return maxSum;
     }
    public static void main(String[] args) {
        // int [] array = {1, 2, 3, 4, 5};
        int array [] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.print("The array is : ");

        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // System.out.println("\nThe sub-arrays are : \n");
        // maxsum(array);
        System.out.println();
        System.out.println("Maximum Subarray sum is : " + maxSumKadane(array));
        // System.out.println("Mqaximum SubArray Sum is : " + maxSumPrefix(array));
        // System.out.println("Maximum SubArray Sum is : " + maxSum(array));
    }
}
