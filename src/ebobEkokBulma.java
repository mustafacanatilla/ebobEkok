import java.util.Scanner;

public class ebobEkokBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 Sayısını Giriniz:");
        int sayi1 = input.nextInt();
        System.out.print("n2 Sayısını Giriniz:");
        int sayi2 = input.nextInt();
        int ebob = 1;

        /* Döngü birimi = 18 Döngü (EBOB) */
        for (int i = 1; i <= sayi1; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                System.out.println(i);
                ebob = i;
            }
        }
        System.out.println("=========");

        /* Döngü Birimi = 14 Döngü (EBOB) */
        for (int k = sayi1; k >= 1; k--) {
            if (sayi1 % k == 0 && sayi2 % k == 0) {
                System.out.println(ebob);
                ebob = k;
                break;
            }
        }
        /* Ekok Bulma */
        System.out.println("Ekok Bulma");
        System.out.println("=========");
        for (int x = 1; x <= (sayi1 * sayi2); x++) {
            if (x % sayi1 == 0 && x % sayi2 == 0) {
                System.out.println(x);
                break;
            }
        }
    }
}
