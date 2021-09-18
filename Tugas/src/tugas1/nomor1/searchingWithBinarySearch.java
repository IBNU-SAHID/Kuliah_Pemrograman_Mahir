package tugas1.nomor1;

import java.util.Scanner;

public class searchingWithBinarySearch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] data = new int[10];
        int target;


        //input bilangan
        System.out.println("Masukan bilangan : ");
        for (int i = 0; i < data.length; i++) {
            data[i] = input.nextInt();
        }
        //input target angka yang dicari
        System.out.println("Masukan angka yang dicari : ");
        target = input.nextInt();

        //menampilkan hasil
        System.out.println(binarySearch(data,target));

    }

    //method pencarian binary search
    static String binarySearch(int[] data,int target) {
        int bawah = 0;
        int atas = data.length - 1;

        while (atas >= bawah) {
            int tengah = (bawah + atas) / 2;
            if (target < data[tengah]){
                atas = tengah - 1;
            } else if (target == data[tengah]){
                return "Angka " + target + " terdapat pada array index ke " + (tengah);
            }else{
                bawah = tengah + 1;
            }
        }
        return "Angka " + target + " tidak terdapat pada array";
    }
}
