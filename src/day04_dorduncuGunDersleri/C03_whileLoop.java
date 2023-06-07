package day04_dorduncuGunDersleri;

import java.util.Scanner;

public class C03_whileLoop {
    public static void main(String[] args) {

        // While Döngüsü : Bir şart true değerini aldığı sürece çalışmaya devam eder !

        int sayi=1;

        while(sayi<10) // ŞARTIN KENDİSİ
        {
            // KOMUTLAR
            System.out.println(sayi);
            sayi++;
        }

        // Kullanıcıdan istediği kadar sayı girmesini isteyiniz, girilen sayıların toplamını yazdırınız.
        // 0'e bastığı anda girilen sayıların toplamını ekrana yazdırınız.

        boolean durum = true;
        Scanner scan = new Scanner(System.in);
        int toplam=0;

        while(durum){

            System.out.println("Lütfen sayı giriniz ! = ");
            int girilenSayi = scan.nextInt();

            if(girilenSayi!=0){
                toplam= toplam+girilenSayi;
            }
            else {
                durum=false;
            }
        }
   /*
        for (int i=0;i<1;i++){

            System.out.println("Lütfen sayı giriniz ! = ");

            int girilenSayi = scan.nextInt();

            if(girilenSayi!=0){
                toplam= toplam+girilenSayi;
                i=-1;
            }

        }
*/
        System.out.println("Girdiğiniz sayıların toplamı = " + toplam);




    }
}
