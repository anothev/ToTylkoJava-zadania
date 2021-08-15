import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wiek");

        int wiek = scan.nextInt();
        System.out.println("Twój wiek to " + wiek);

        if (wiek <= 0) return;
        if (wiek > 122) return;

        if (wiek < 18) {
            System.out.println("Jesteś dzieckiem");
        } else if (wiek <= 30) {
            System.out.println("Jesteś młody");
        } else if (wiek <= 50) {
            System.out.println("Jesteś w średnim wieku");
        } else {
            System.out.println("Jesteś stary");
        }

    }
}
