import java.util.Scanner;

public class Warehouse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Unesite broj gajbi: ");
        int gajbe = input.nextInt();

        System.out.print("Unesite broj kamiona: ");
        int kamioni = input.nextInt();


        for (int i = 1; i <= kamioni && gajbe >= 0; i++) {
            System.out.print("Koliko gajbi moze da stane u kamion: ");
            int kapacitet = input.nextInt();
            gajbe -= kapacitet;


            if(i == kamioni && gajbe <= 0) {
                System.out.println("Sve gajbe su utovarene u sve kamione");

            }
            if (i < kamioni && gajbe <= 0) {
                System.out.println("Sve gajbe su utovarene, " + (kamioni - i) + " kamiona su visak.");

            }
            if (i >= kamioni && gajbe > 0){
                System.out.println("Nema vise kamiona, ostalo je " + gajbe + " gajbi");

            }
        }

    }
}
