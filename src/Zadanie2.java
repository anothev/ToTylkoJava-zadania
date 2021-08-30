public class Zadanie2 {
    public static void main(String[] args) {
        int stars = 1;

        for (int y = 1; y <= 7; y++) {
            System.out.print(y + ": ");

            for (int space = 7; space > y; space--) {
                System.out.print("-");
            }
            for (stars = 0; stars < y; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }




    }
}
