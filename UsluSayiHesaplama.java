import java.util.Scanner;

public class UsluSayiHesaplama{

    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int base = myScanner.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int exponent = myScanner.nextInt();
        System.out.println("Sonuç: " + power(base, exponent));

    }
}