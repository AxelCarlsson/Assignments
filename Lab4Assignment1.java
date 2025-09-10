import java.util.Scanner;

public class Lab4Assignment1 {
    public static void main(String[] args) {
        /*
         * Läs in två tal
         * 
         * MEDAN (input != tal)
         *    skriv ut "Det var inte ett tal, försök igen"
         * 
         * OM (tal1 > tal2)
         *    skriv ut "tal1 är störst"
         * ANNARS OM (tal2 > tal1)
         *    skriv ut "tal2 är störst" 
         * ANNARS
         *    skriv ut "de är lika stora"
         */

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Input number 1");
        int num1 = 0;

        while (!scanner.hasNextInt()){
            System.out.println("Not a number, input number 1");
            scanner.next();
        } 
        num1 = scanner.nextInt();

        System.out.println("Input number  2");
        int num2 = 0;

        while (!scanner.hasNextInt()){
            System.out.println("Not a number, input number 2");
            scanner.next();
        } 
        num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println("Number 1 is bigger");
        } else if (num2 > num1) {
            System.out.println("Number 2 is bigger");
        } else {
            System.out.println("The numbers are equal");
        }

    }
}
