public class Zadanie2PoprawnaWersja {
//    static void printStars(int starsCount) {
//        for (int stars = 0; stars < starsCount; stars++) {
//            System.out.print("*");
//        }
//    }
//
//    static void printSpaces(int spacesCount) {
//        for (int space = 0; space < spacesCount; space++) {
//            System.out.print("-");
//        }
//    }
//
    static void printChar(int count, char ch) {
        for (int i = 0; i < count; i++) {
            System.out.print(ch);
        }
    }
    public static void main(String[] args) {
        int rowCount = 7;

        for (int row = 0; row < rowCount; row++) {
            int rowNo = row + 1;
//            System.out.print(rowNo + ": ");
            System.out.format("%2d: ", rowNo);

            int spacesCount = rowCount - row;
            printChar(spacesCount,' ');

            int starsCount = 2 * row + 1;
            printChar(starsCount,'*');

            System.out.println();
        }

    }
}
