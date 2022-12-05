public class pairsInArray {

    static void printPairs(int [] array) {
        int tp = 0; //total no of pairs
        for(int i=0; i<array.length; i++) {
            int curr = array[i];
            for(int j=i+1; j<array.length; j++) {
                 System.out.print("(" + curr + "," + array[j] + ")");
                 tp++;
            }
            System.out.println();
        }
        System.out.println("Total no. of pairs are : " + tp);
    }
    public static void main(String[] args) {
        int [] array = {2, 4, 6, 8, 10};

        System.out.println("The array is : ");
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\npairs are : ");
        printPairs(array);

    }
}
