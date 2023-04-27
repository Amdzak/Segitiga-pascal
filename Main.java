//2023/04/27  18:27

// Program untuk menghasilkan segitiga Pascal menggunakan array 2D

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.println("\tProgram segitiga pascal");
        System.out.print("Masukan jumlah baris yang di inginkan : ");
        int baris = inputUser.nextInt();

        int[][] pascal = new int[baris][baris];

        for (int i = 0; i < baris; i++) { //pengulangan unutk membuat baris
            for (int j = 0; j <= i; j++) { //pengulangan untuk membuat kolom
                if (j == 0 || j == i) { // kodisi dimana saat kolom pertama atau kolom samadengan baris maka akan memasuki kondisi if
                    pascal[i][j] = 1 ;
                } else{
                    pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j]; // rumus untuk segitiga pascal
                }

                System.out.print(pascal[i][j] + " "); //mencetak hasil segitiga pascal tadi
            }
            System.out.println(); //sebagai enter jika ssudah mencapai baris akhir
        }
    }
}
