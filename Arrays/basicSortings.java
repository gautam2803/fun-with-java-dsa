public class basicSortings {

    //bubble sort
    /* 
    static void bubbleSort(int array[]) {
        int size = array.length;

        for(int turns=0; turns<size-1; turns++) {
            for(int j=0; j<size-1-turns; j++) {
                if(array[j] > array[j+1]) {
                    //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    */

    //selection sort
    static void selectionSort(int array[]) {

    }
    public static void main(String[] args) {
        int num [] = {2, 9, 7, 5, 10};
        System.out.println("original array : ");
        for(int i=0; i<num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println("Array after Sorting is : ");
        bubbleSort(num);
        for(int i=0; i<num.length; i++) {
            System.out.print(num[i] + " ");
        }

    }
    
}
