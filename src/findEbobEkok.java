import java.util.Scanner;

public class findEbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, kucukSayi;
        int ebob = 1, ekok = 2;


        System.out.print("1. Sayiyi Giriniz:");
        sayi1 = input.nextInt();

        System.out.print("2. Sayiyi Giriniz:");
        sayi2 = input.nextInt();

        if (sayi1 > sayi2) {
            kucukSayi = sayi2;
        } else {
            kucukSayi = sayi1;
        }
        int i = kucukSayi;
        while (i >= 1) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
                System.out.println("Sayıların Ebob Değeri:" + i);
                break;
            }
            i--;
        }
        System.out.println("==========");
        System.out.print("Sayıların Ekok Değeri:" + (sayi1 * sayi2) / ebob);
    }
}
