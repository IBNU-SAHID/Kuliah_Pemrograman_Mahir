package tugas1.nomor2;

import java.util.Scanner;

public class sortingWithBubbleSort {

    public static void main(String[] args) {
        int[] data = new int[8];
        Scanner input = new Scanner(System.in);

        //input data yang akan di sorting
        System.out.println("Masukan data : ");
        for (int i = 0; i < data.length; i++) {
            data[i] = input.nextInt();
        }

        //sorting data dengan method bubbleSort
        bubbleSort(data);

        //menampilkan data pada array yang sudah terurut
        for(int i:data){
            System.out.print(i+" ");
        }

    }

    //Method sorting data dengan bubble sort
    static void bubbleSort(int[] data) {
        int n = data.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (data[j - 1] > data[j]) {
                    //Menukar Element
                    temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                }

            }
        }
    }
}
