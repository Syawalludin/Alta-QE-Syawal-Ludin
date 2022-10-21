package OOP;
import java.util.Scanner;

public class MenghitungLuasdanKeliling {
    private static void persegi(int panjangp, int lebarp) {
        int kelilingp, luasp;


        //Persegi
        kelilingp = 2 * panjangp + 2 * lebarp;
        luasp = panjangp * lebarp;

        System.out.println("Persegi luas : "+Math.round(luasp));
        System.out.println("Persegi keliling : "+Math.round(kelilingp));

    }

    private static void Segitiga(int sisi, int alas) {
        double luass;
        int kelilings;

        //Segitiga
        luass = 0.5 * sisi * alas;
        kelilings = 3 * alas;

        System.out.println("Segitiga luas : "+Math.round(luass));
        System.out.println("Segitiga keliling : "+Math.round(kelilings));
    }

    private static void panjang(int panjang, int lebar) {
        int keliling, luas;
        //Persegi Panjang
        keliling = 2 * (panjang + lebar);
        luas = panjang * lebar;

        System.out.println("Persegi Panjang luas : "+Math.round(luas));
        System.out.println("Persegi Panjang keliling : "+Math.round(keliling));

    }

    public static void main(String[] args) {

        //Luas
        System.out.print("Output: \n");

        //persegi
        persegi(4,4);


        //persegi
        Segitiga(3,4);

        //persegi
        panjang(7,8);

    }
}
