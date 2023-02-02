public class bargraphArray {

    public static void bargraph(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        for(int i = max; i >=1; i--) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] < i) {
                    System.out.print("\t");
                }
                else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 3, 6, 0, 12};
        bargraph(arr);
    }
}
