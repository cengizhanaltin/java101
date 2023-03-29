package Giris;
import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        int mat, fiz, kim, tur, tar, muz;
        double ortalama=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik Notunuzu Giriniz:");
        mat = scanner.nextInt();

        System.out.println("Fizik Notunuzu Giriniz:");
        fiz = scanner.nextInt();

        System.out.println("Turkce Notunuzu Giriniz:");
        tur = scanner.nextInt();

        System.out.println("Kimya Notunuzu Giriniz:");
        kim = scanner.nextInt();

        System.out.println("Tarih Notunuzu Giriniz:");
        tar = scanner.nextInt();

        System.out.println("Muzik Notunuzu Giriniz:");
        muz = scanner.nextInt();

        ortalama = (mat + fiz + tur + kim + tar + muz)/6;
        System.out.println("Ortalama : " + ortalama);
        System.out.println(ortalama>60?"Sınıfı Geçtiniz":"Sınıfta Kaldınız");


    }
}
