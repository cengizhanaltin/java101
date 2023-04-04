package Giris;

import java.util.Scanner;


public class Hipotenus {
    public static void main(String[] args) {
        double a,b,c,hipotenus;
        System.out.println("1. kenarı giriniz : ");
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        System.out.println("2. kenarı giriniz : ");
        b=scanner.nextInt();
        c = a * a + b * b ;
        hipotenus = Math.sqrt(c);

        System.out.println("Üçgenin hipotenüs uzunluğu :  " + hipotenus + " 'dir");



    }
}
