import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double acilis=10.0;
        double km;

        System.out.println("Km cinsinden mesafe giriniz:  ");
        km = input.nextDouble();

        double perkm = km * 2.2;
        double toplam = (perkm + acilis);

        String durum = (toplam<=20) ? "Ücretiniz : 20 TL"  :  ("Ücretiniz : " +toplam);
        System.out.println(durum);
    }
}
