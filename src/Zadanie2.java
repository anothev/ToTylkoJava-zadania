public class Zadanie2 {
    public static void main(String[] args) {
        int rowCount = 7;

        for (int row = 0; row < rowCount; row++) {
            int rowNo = row + 1;
            System.out.print(rowNo + ": ");
//            System.out.format("%2d: ", rowNo);

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



    }
}
