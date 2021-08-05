public class Zadanie1 {
    public static void main(String[] args) {
        int wiek = 0;

        if (wiek <=0) return;
        if (wiek > 122) return;

        if (wiek < 18) {
            System.out.println("Jesteś dzieckiem");
        } else if ((wiek >= 18) && (wiek <=35)) {
            System.out.println("Jesteś młody");
        } else if ((wiek > 35) && (wiek <= 60)) {
            System.out.println("Jesteś w średnim wieku");
        } else if ((wiek > 60) && (wiek <=122)) {
            System.out.println("Jesteś stary");
        }
    }
}
