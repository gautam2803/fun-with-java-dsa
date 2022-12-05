// import java.util.*;

public class arrays {

    public static void updateByOne(int array[]) {
        for(int i=0; i<array.length;i++) {
            array[i] += 1;
        }
    }
    public static void main(String[] args) {
        //Arrays operation
       /*  1. Creating an array
            Syntax: dataType arrayName[] = new dataType[size]; 
            */
            // int marks[] = new int[50];
            // int numbers[] = {1,2,3};
            // int moreNumbers[] = {4,5,6};
            // String fruits[] = {"apple", "mango", "banana"};
            // Scanner sc = new Scanner(System.in);
            // int marks[] = new int[100];
            // marks[0] = sc.nextInt();//phy
            // marks[1] = sc.nextInt();//chem
            // marks[2] = sc.nextInt();//maths
            // System.out.println("phy : " + marks[0]);
            // System.out.println("chem : " + marks[1]);
            // System.out.println("maths : " + marks[2]);
            //updating array
            // marks[2] = 100;
            // System.out.println("maths : " + marks[2]);
            // System.out.println(marks.length);
            int marks[] = {45, 56, 98};
            System.out.println("original marks");
            for(int i=0; i<marks.length; i++) {
                System.out.println(marks[i]);
            }
            updateByOne(marks);
            System.out.println("marks after updation : ");
            for(int i=0; i<marks.length; i++) {
                System.out.println(marks[i]);
            }
    }
}
 