public class Lab4Assignment4 {
    public static void main(String[] args) {
        /*
         * Skriv ut multiplikationstabellen
         * 1-10 med två nästlade loopar
         * 
         * FÖR i < 10 
         *  FÖR j < 10
         *    Skriv ut i * j
         */


        for (int i = 1; i < 11; i++) {
            if (i == 1) {
                System.out.print(" ");
                for (int y = 1; y < 11; y++){
                    System.out.printf("%4d", i * y);    
                }
            }
            System.out.println();
            System.out.print(i);
            for (int j = 1; j < 11; j++){
                System.out.printf("%4d", i * j);
            }
        }
    }
}
