package IkinciGunDersleri;

import java.util.Scanner;

public class forLoopOrnek1 {

    // Kullanıcıdan alınan sayının faktöriyelini bulalım.

    // Sayını sürekli 1 azalması
    // Azalan her sayı art arda çarpılması lazım
    //
    //sayac--  >> sayac = sayac - 1;
    public static void main(String[] args) {
        int faktoriyel=1;
        Scanner girilenSayiyiAl = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz!");
        int sayi = girilenSayiyiAl.nextInt();

        // Sayıdan 1'e kadar gittik
        // azaltarak hesaplama
        for(int sayac=sayi;sayac>=1;sayac--){

            faktoriyel = faktoriyel * sayac;
        }
        System.out.println(sayi+"! = "+ faktoriyel);

        // 1 Den sayıya kadar gittik.
        faktoriyel=1;
        for(int sayac=1;sayac<=sayi;sayac++){
            faktoriyel = faktoriyel * sayac;
        }
        System.out.println(sayi+"! = "+ faktoriyel);

    }



}
