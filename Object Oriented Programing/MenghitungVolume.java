package OOP;
import java.util.Scanner;

public class MenghitungVolume {
    private static void kubus(int sisi){
        int vk;
        vk = sisi * sisi * sisi;
        System.out.println("Kubus: "+vk);

    }
    private static void balok(int p, int l, int t){
        int vb;
        vb = p * l * t;
        System.out.println("Balok: " + vb);

    }
    private static void tabung(int r, int t){
        double vt;
        double pi = 3.14;
        vt = pi * r * r * t;
        System.out.println("Tabung: " + Math.round(vt));

    }
    public static void main(String[] args){

        System.out.println("Output : ");

        kubus(10);
        balok(3,6,10);
        tabung(7,10);
    }
}
