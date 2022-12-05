// import java.util.*; //for using Scanner class


public class javaBasics {

    //functions 
    public static void printHW(){
        System.out.println("HelloWorld");
    }

    public static int printName(){
        System.out.println("Deepak Gautam");
        System.out.println("Deepak Gautam");
        System.out.println("Deepak Gautam");
        return 3;
    }

    public static int sum(int a, int b){
      return a+b;
    }
    public static void main(String args[]) {
        /* Print Statements in Java
        System.out.print("Hello World");
        System.out.println("output in next line");
        System.out.print("ye nyi line mein aayega");
        */
        //java DataTypes

      /*
        byte a = 10;
        short b = 20;
        char ch = 'c';
        boolean bool = true;
        int i = 30;
        long l = 10020;
        float f = 33;
        double d = 234324.234324;
        System.out.print(a);
        System.out.print(b);
        System.out.print(ch);
        System.out.print(bool);
        System.out.print(i);
        System.out.print(l);
        System.out.print(d);
        System.out.print(f);
        
     */

        // sum of a and b
        /*
        int a = 5 , b = 6;
        int sum ;
        sum = a + b;
        System.out.println(sum);
        */


        //input in java 
        // Scanner sc = new Scanner(System.in);
        // String input = sc.next(); //capture a word 
        // System.out.println(input);
        // String input2 = sc.nextLine(); // captures a line
        // System.out.println(input2);


        // sum of two user input numbers
        // int a,b,sum;
        // a = sc.nextInt();
        // b = sc.nextInt();
        // sum = a + b;
        // System.out.println(sum);;
        // //product of a and b;
        // int product;
        // product = a *b;
        // System.out.println(product);

        // area of circle
        // float radius = sc.nextFloat();
        // float area = 3.14f*radius*radius;
        // System.out.println(area);

        //operator in java 
        // arithmetic operator
        // int a = 5, b = 6;
        // System.out.println("add = "+ (a+b));
        // System.out.println("sub = " + (a-b));
        // System.out.println(a*b);
        // System.out.println(a/b); 
        // System.out.println(a%b);

        //increment - decrement operators 
        // System.out.println(a + " "+ b);
        // int c = ++a;
        // System.out.println(a + " " + c);
        // int d = b++;
        // System.out.println(a + " " + b+" "+c +" " + d);
        // System.out.println(a!=b);
        // int x = 2, y = 5;
        // int exp1 = (x * y / x);
        // int exp2 = x * (y / x);
        // System.out.println("exp1 = "+exp1+" "+"exp2 = "+ exp2);



        printHW();
        printHW();
        printName();
        System.out.println(printName());
        System.out.println(sum(10,20));
        // printing star program
      /*
        *
        **
        ***
        ****
      */
      for(int row=1; row<=400; row++) {
        for(int times=1; times<=row; times++) {
          System.out.print("*");
        }
        System.out.println();
      }


    


    }
}