import java.util.Scanner;

public class Lab4Assignment6 {
    public static void main(String[] args) {
        /*
         * Slumpa fram ett tal 1-100
         * 
         * Skriv ut "Gissa ett heltal 1-100"
         * 
         * OM gissning < tal
         *  skriv ut "För lågt"
         * OM gissning > tal
         *  skriv ut "För högt"
         * OM gissning == tal
         *  skriv ut "Rätt!"
         */

        Scanner sc = new Scanner(System.in);
        int max = 100;
        int min = 1;
        int randomNbr = (int) (Math.random() * (max - min)) + min ;
        System.out.println("Guess a number 1-100");
        int input = sc.nextInt();

        while (input != randomNbr){
            if (input > randomNbr) System.out.println("Too high");
            if (input < randomNbr) System.out.println("Too low");
            input = sc.nextInt();
        }
        
        System.out.println("Correct! It was " + randomNbr);
    }
}
