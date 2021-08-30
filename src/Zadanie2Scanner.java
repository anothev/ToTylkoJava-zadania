import java.util.Scanner;

public class Zadanie2Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile rzędów gwiazdek Ci wydrukowac: ");
        int rowCount = scanner.nextInt();

        if (rowCount >= 1 && rowCount <= 20) {

            for (int row = 0; row < rowCount; row++) {
                int rowNo = row + 1;
                System.out.format("%2d: ", rowNo);

                int spacesCount = rowCount - row;
                for (int space = 0; space < spacesCount; space++) {
                    System.out.print("-");
                }

                int starsCount = 2 * row + 1;
                for (int stars = 0; stars < starsCount; stars++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        } else {
            System.out.println("Liczba rzędów musi wynosic od 1 do 20");
        }


    }


}

