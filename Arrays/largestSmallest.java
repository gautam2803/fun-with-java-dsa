public class largestSmallest {

    //code to find largest number
    static int largest(int array[]) {
        // int largest = array[0];
        int largest = Integer.MIN_VALUE;
        for(int i=1; i<array.length; i++) {
            if(array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }

    //code to find smallest number
    static int smallest(int array[]) {
        // int smallest = array[0]; 
        int smallest = Integer.MAX_VALUE;
        for(int i=1; i<array.length; i++) {
            if(array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int numbers[] = {21, 45, 1, 76, 98, 456, 134};
        int largestValue = largest(numbers);
        int smallestValue = smallest(numbers);
        System.out.println("largest value is : " + largestValue);
        System.out.println("smallest value is : " + smallestValue);

    }
}
