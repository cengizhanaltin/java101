package Giris;


import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        double gidilenKm, tutar, kmbasiTl=2.2, minTutar = 20, acilisUcret=10;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç km yolculuk yapıldı : ");
        gidilenKm= scanner.nextDouble();

        tutar = acilisUcret + (kmbasiTl * gidilenKm);

        if (tutar<20){
            tutar=minTutar;
        }



        System.out.println("Ödenecek Tutar " + (float) tutar  + "TL dir.");





    }
}
