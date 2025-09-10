import java.util.Scanner;

public class Lab4Assignment7 {
    public static void main(String[] args) {
        /*
         * Initialisera variabel för faktura
         * Skriv ut "Ange behandling 1-3 eller -1 ifall klar"
         * 
         * MEDAN input != -1
         *  OM angav 1
         *      Lägg till 600 till faktura
         *  OM angav 2
         *      Lägg till 300 till faktura
         *  OM angav 3
         *      Lägg till 1500 till faktura
         *  Skriv ut "Ange behandling 1-3 eller -1 ifall klar"
         * 
         * OM faktura >= 3000
         *  dra av 10%
         * 
         * skriv ut fakturan
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Ange behandling 1-3 eller -1 ifall klar");
        int input = sc.nextInt();
        double invoice = 0;

        while (input != -1){
            if (input == 1) invoice += 600;
            if (input == 2) invoice += 300;
            if (input == 3) invoice += 1500;
            System.out.println("Ange behandling 1-3 eller -1 ifall klar");
            input = sc.nextInt();
        }

        if (invoice >= 3000) invoice *= 0.9;
        
        System.out.printf("Kostnaden blev: %.2f", invoice);
    }
}
