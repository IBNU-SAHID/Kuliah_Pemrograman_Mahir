package tugas1.nomor1;

import java.util.Scanner;

public class searchingWithSequentialSearch {

    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);
        //array dan variabel
        int[] angka = new int[10];
        int taget;

        //input bilangan
        System.out.println("Masukan bilangan : ");
        for (int i = 0; i < angka.length; i++) {
            angka[i] = input.nextInt();
        }

        //input angka yang dicari
        System.out.println("Masukan angka yang dicari : ");
        taget = input.nextInt();

        //menampilkan hasil
        System.out.println(sequentialSearch(angka,taget));


    }

    //Method pencarian squential
    static String sequentialSearch(int[] angka, int taget) {

        //perulangan untuk mencari angka pada array
        for (int i = 0; i < angka.length; i++) {

            if (taget == angka[i]) {
                return "Angka " + taget + " terdapat pada array index ke " + i ;
            }
        }
        return "Angka " + taget + " tidak terdapat pada array";
    }

}