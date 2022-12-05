public class binarySearch {

    static int bSearch(int array[], int key) {
        int start = 0, end = array.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (array[mid] == key) {return mid;} 

            else if (array[mid] < key) {start = mid + 1;} 
            
            else {end = mid - 1;}
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 8;
        int result = bSearch(array, key);
        if (result == -1) {
            System.out.println(key + " Not Found");
        } else {
            System.out.println(key + " found at index : " + result);
        }
    }
}
