import java.util.Scanner;

public class Konversi_Nilai {
    public static void main(String[] args) {
        //input
        int studentScore = 20;

        //MyCode
        System.out.println("Masukkan Sebuah Nilai = "+ studentScore);

        if (studentScore>=80 && studentScore<=100){
            System.out.println("A");
        }
        else if (studentScore>=65 && studentScore<=79){
            System.out.println("B+");
        }
        else if (studentScore>=50 && studentScore<=64){
            System.out.println("B");
        }
        else if (studentScore>=35 && studentScore<=49){
            System.out.println("C");
        }
        else if (studentScore>=0 && studentScore<=34) {
            System.out.println("D");
        }
        else {
            System.out.println("invalid");
        }
    }
}
