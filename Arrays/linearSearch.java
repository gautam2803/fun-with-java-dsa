public class linearSearch {

    static int lSearch(int array[], int key) {
        for(int i=0; i<array.length; i++) {
            if(array[i] == key) {
                return i;
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        int index = lSearch(numbers, key);
        if(index == -1) {
            System.out.println(key + " is not present in the array");
        }
        else {
            System.out.println(key + " found at index : " + index);
        }
    }
}