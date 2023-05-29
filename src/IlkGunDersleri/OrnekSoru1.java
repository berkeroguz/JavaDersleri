package IlkGunDersleri;

import java.util.Scanner;

public class OrnekSoru1 {

    public static void main(String[] args) {

        /*
           Kullanıcıdan Yaşını isteyiniz. Girilen yaşa göre emekli olabilirsin veya olamazsın yazdırınız.

         Emekli olma şartı 65 ve üzeri yaş gerektirir.
         65ten küçükse emekli olamazsın yazacak.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scan.nextInt();

        if (yas < 30 || yas > 120) {
            // Yas 30dan küçük ya da 120den büyük olamaz
            System.out.println("Lütfen düzgün bir yaş giriniz. ");
        } else {

            if (yas >= 65) {
                System.out.println("Emekli olabilirsin");
            } else System.out.println("Emekli olamazsınız!");

        }


    }
}
