package day02_IkinciGunDersleri;

import java.util.Scanner;

public class UsluSayiHesaplamaForile {
    public static void main(String[] args) {

        //girilen alt ve üst değerlerini kullanıcıdan alarak gerekli işlemi sağlayınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen tabanı giriniz.");
        int taban = scan.nextInt();
        System.out.println("Lütfen üssü giriniz.");
        int us = scan.nextInt();
        int sonuc=1;


        for (int i=1;i<=us;i++){  //Bu döngü 1'den üsse kadar kadar sayar, döner.

            sonuc=sonuc*taban;
        }
        System.out.println(taban + " üzeri " + us + " =  " + sonuc + " eder.");

        sonuc=1;
        for (int i=us;i>0;i--){ // Bu döngü ise üs'den 1'e kadar döner.

            sonuc=sonuc*taban;

        }
        System.out.println(taban + " üzeri " + us + " =  " + sonuc + " eder.");
    }
}
