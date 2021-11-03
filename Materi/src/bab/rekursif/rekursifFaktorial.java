package bab.rekursif;

import java.util.Scanner;
public class rekursifFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        System.out.println(factorial(n));


    }
    //method faktorial
    static int factorial(int n){
        if (n == 1){
            return 1;
        }else {
            return (n * factorial(n-1)) ;
        }
    }
}
