import java.util.Scanner;

public class Lab4Assignment3 {
    public static void main(String[] args) {
        /*
         * Användaren skriver in ett tal
         * Skriv ut multiplikationstabellen 
         * för talet
         * 
         * Be användare om input
         * FÖR input * i upp till i = 10
         *  skriv ut i * input
         */
        
        System.out.println("Vilken multiplikationstabbel vill du använda?");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 1; i < 11; i++){
            System.out.println(i * input);
        }
    }
}
