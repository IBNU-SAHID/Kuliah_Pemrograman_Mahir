package bab.rekursif;

import java.util.Scanner;

public class rekursifFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("n = ");
        int n = input.nextInt();
        System.out.print("F1 = ");
        int a = input.nextInt();//f1
        System.out.print("F2 = ");
        int b = input.nextInt();//f2
//        int n = 3;
//        int a = 0;
//        int b = 1;
        for (int i = 0;i <= n; i++){
            System.out.println("Fibonacci ke-" + i + " = " + fibonacci(a,b,i));
        }


    }

    // Method fibonacci
    static int fibonacci(int a,int b,int n) {
        if (n == 0){
            return a;
        }else if (n == 1) {
            return b;
        }else {
            return fibonacci(b,a+b,n-1);
        }
    }

}
