import java.util.Scanner;

public class Lab4Assignment2 {
    public static void main(String[] args) {
        /*
         * Läs in tre tal
         * 
         * OM (tal1 == tal2 && tal1 == 3)
         *  skriv ut "Alla tal är lika stora"
         * OM (tal1 > tal2 && tal1 > tal3)
         *  skriv ut "X tal är sörst"
         * OM (tal1 == tal2 && tal1 > tal3) 
         *  skriv ut "X och Y är lika stora och Z är minst"
         * 
         * Kan använda array för att minska koden förmodligen
         * 
         */

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input number 1");
        int num1 = scanner.nextInt();
        System.out.println("Input number 2");
        int num2 = scanner.nextInt();
        System.out.println("Input number 3");
        int num3 = scanner.nextInt();
        
        if (num1 == num2 && num1 == num3) System.out.println("All numbers are equal");

        if (num1 > num2 && num1 > num3) {
            System.out.println("Number 1 is the biggest");
        }
        
        if (num2 > num1 && num2 > num3) {
            System.out.println("Number 2 is the biggest");
        }
        
        if (num3 > num2 && num3 > num2) {
            System.out.println("Number 3 is the biggest");
        }
        
        if (num1 == num2 && num1 > num3){
            System.out.println("Number 1 and number 2 are equal and bigger than number 3");
        }
        if (num1 == num3 && num1 > num2){
            System.out.println("Number 1 and number 3 are equal and bigger than number 2");
        }
        if (num3 == num2 && num3 > num1){
            System.out.println("Number 3 and number 2 are equal and bigger than number 1");
        }
    }
}
