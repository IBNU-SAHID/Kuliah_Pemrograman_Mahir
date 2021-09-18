package tugas1.nomor2;

import java.util.Scanner;

public class sortingWithSelectionSort {
    //run
    public static void main(String[] args) {
        int[] data = new int[8];
        Scanner input = new Scanner(System.in);

        //input data yang akan di sorting
        System.out.println("Masukan data : ");
        for (int i = 0; i < data.length; i++) {
            data[i] = input.nextInt();
        }

        //sorting data
        selectionSort(data);

        //menampilkan data yang sudah terurut
        for(int i:data){
            System.out.print(i+" ");
        }

    }

    //Method sorting dengan selectionSort
    public static void selectionSort(int[] data) {
        //mengurutkan data
        for (int i = 0; i < data.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[index]) {
                    index = j;  //Mencari index terendah
                }
            }
            int angkaTerkecil = data[index];
            data[index] = data[i];
            data[i] = angkaTerkecil;
        }

    }
}
