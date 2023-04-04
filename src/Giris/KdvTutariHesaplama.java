package Giris;
import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {
        double kdv = 1.18;
        double fiyat;
        double kFiyat;

        System.out.print("Ürün fiyatını giriniz : ");
        Scanner scanner = new Scanner(System.in);
        fiyat= scanner.nextDouble();

        if (fiyat>=1000){
            kdv = 1.08;
        }
        kFiyat = fiyat * kdv;

        System.out.println("KDV ' li fiyat : " + kFiyat);





    }
}
