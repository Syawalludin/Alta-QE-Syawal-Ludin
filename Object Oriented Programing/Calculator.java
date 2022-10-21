package OOP;

import java.util.Scanner;

public class Calculator {
    private static void Penjumlahan(double x, double y){
        double hasil;
        hasil = x + y;
        System.out.println("Hasil : " + hasil);
    }
    private static void Pengurangan(double x, double y){
        double hasil;
        hasil = x - y;
        System.out.println("Hasil : " + hasil);
    }
    private static void Perkalian(double x, double y){
        double hasil;
        hasil = x * y;
        System.out.println("Hasil : " + hasil);
    }
    private static void Pembagian(double x, double y){
        double hasil;
        hasil = x / y;
        System.out.println("Hasil : " + hasil);
    }

    public static void main(String[] args) {
        String pilih_operasi;
        int angka1 = 0;
        int angka2 = 0;

        Scanner input_pilihan = new Scanner(System.in);
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Input pilihan : ");
        pilih_operasi = input_pilihan.next();

        System.out.print("Masukkan Angka Pertama : ");
        angka1 = input_pilihan.nextInt();

        System.out.print("Masukkan Angka Kedua : ");
        angka2 = input_pilihan.nextInt();

        if (pilih_operasi.equals("1")) {
            Penjumlahan((int) angka1, (int) angka2);
        } else if (pilih_operasi.equals("2")) {
            Pengurangan((int) angka1, (int) angka2);
        } else if (pilih_operasi.equals("3")) {
            Perkalian((int) angka1, (int) angka2);
        } else if (pilih_operasi.equals("4")) {
            Pembagian((int) angka1, (int) angka2);
        } else {
            System.out.println("Error!");
        }

    }
}
