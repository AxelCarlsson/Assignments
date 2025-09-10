import java.util.Scanner;

public class Lab4Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = 0, winsP1 = 0, winsP2 = 0;
        int amountOfRounds = 3;

        while (counter < amountOfRounds){
            System.out.println("Spelare 1, skriv in ett tal");
            int inputP1 = sc.nextInt();
            System.out.println("Spelare 2, skriv in ett tal");
            int inputP2 = sc.nextInt();

            if (inputP1 == inputP2) System.out.println("Oavgjort!");
            if (inputP1 > inputP2){
                System.out.println("Spelare 1 vann rundan!");
                winsP1++;
            } else if (inputP2 > inputP1){
                System.out.println("Spelare 2 vann rundan!");
                winsP2++;
            }
            counter++;
        }

        if (winsP1 == winsP2) System.out.println("Matchen blev oavgjord!");
        if (winsP1 > winsP2){
            System.out.printf("Spelare 1 vann matchen med %d poäng!", winsP1);
        }
        if (winsP2 > winsP1){
            System.out.printf("Spelare 2 vann matchen med %d poäng!", winsP2);
        }
    }
}
