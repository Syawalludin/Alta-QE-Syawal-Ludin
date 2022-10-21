import java.util.Scanner;

public class Faktor_bilangan {
    public static void main(String[] args) {
        //input
        int bilangan;

        //MyCode
        Scanner input = new Scanner(System.in);
        System.out.print("Input Bilangan : ");
        bilangan = input.nextInt();
        System.out.print("Hasil : \n");
        for(int i=1;i<=bilangan;i++)
        {
            if(bilangan%i == 0)
            {
                System.out.print(i + "\n");
            }
        }
    }
}
