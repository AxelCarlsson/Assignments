import java.util.Scanner;

public class Lab4Assignment11 {
    public static void main(String[] args) {
        /*
         * Användare trycker in kort
         * Skriver in PIN
         * 
         * OM PIN ogiltig
         *  mata ut kortet
         *  visa felmeddelande
         * ANNARS
         *  användare anger uttagsbelopp
         *  OM saldo < uttagsbelopp
         *   mata ut kortet
         *   visa felmeddelande
         *  ANNARS
         *   mata ut utagsbeloppet
         *   mata ut kortet
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert PIN");

        int pin = 1234;
        int saldo = 5000;

        int input = sc.nextInt();

         // TODO regex match 4 numbers maybe?

        if (input != pin){
            System.out.println("Wrong PIN. Spitting out card");
        } else {
            System.out.println("Choose withdrawal amount");
            int withdrawal = sc.nextInt();
            if (withdrawal > saldo){
                System.out.println("Insufficient funds. Spitting out card");
            } else {
                System.out.println("Heres your " + withdrawal + "kr");
            }
        }

    }
}
