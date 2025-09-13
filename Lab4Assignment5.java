import java.util.Scanner;

public class Lab4Assignment5 {
    public static void main(String[] args) {
        /*
         * Skriv ut "Ange värde, ange -1 ifall klar"
         * 
         * initialisera variabler
         * 
         * SÅ LÄNGE variabel != -1
         *  +1 för antal värden
         *  spara värdet i variabel
         *  skriv ut "Ange värde, ange -1 ifall klar"
         *  spara över variabel med nytt värde
         * 
         * Skriv ut medelvärde  
         */
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ange värde. Ange -1 om inga fler värden");

        int counter = 0; 
        int sum = 0;

        int input = sc.nextInt();
        while (input != -1){
            counter++;
            sum += input;
            System.out.println("Ange värde. Ange -1 om inga fler värden");
            input = sc.nextInt();
        }

        double average = (double) sum / counter;
        System.out.printf("Medelvärdet är %.2f%n ", average);
    }
}
