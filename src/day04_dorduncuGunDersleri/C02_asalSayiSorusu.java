package day04_dorduncuGunDersleri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C02_asalSayiSorusu {
    public static void main(String[] args) {

        // ArrrayList, While Döngüsü konuları görülünce bu soru tekrardan çözülecek !!!!

        // girilen sayının asal olup olmadığını belirten programı yazınız.
        // Asal sayı : Yalnızca 1'e ve kendisine bölünebilen sayılara asal sayı denir.

        // Girilen sayı asal değilse hangi sayılara tam bölündüyse ekrana yazdırın.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int sayi = scan.nextInt(); // burada girilen sayıyı sayi değişkenine atadık.
        boolean sonuc = true; // truse ise asaldır false ise asal degildir.
        // İşlem Aşaması
        int [] bolenSayilar = new int[sayi];  // Girilen sayı kapasitesinde bir dizi oluşturuyoruz.
        for (int i=2    ;   i<sayi  ;   i++){  // Bu döngü 2'den sayiya kadar tüm sayilari dolaşır.

            if(sayi % i == 0){  // Eğer girilen sayı herhangi bir sayıya bölünürse bu if'in içerisine girer. Kısaca Modunu aldıyoruz.
                sonuc=false;
                //break; // DÖNGÜNÜN İSTEDİĞİMİZ ZAMAN DURMASINI SAĞLAR. BİLGİSAYAR BU KODU GÖRÜNCE DÖNGÜDEN ÇIKAR.
                //Burada bölünen sayıları bir gruba ayıracağız.
                bolenSayilar[i]=i;
            }
        }
        // Sonuc Değerlendirme Aşaması
        if(sonuc==true){
            System.out.println("Girilen sayı asaldır ! ");
        }
        else{
            System.out.println("Girilen sayı asal değildir !");

            System.out.print("Bölen Sayılar = >> "); // println değil print ile yazdırdık aynı satırdan yazmaya devam edelim diye
            for(int i=0; i<bolenSayilar.length; i ++) { // Yukarıdaki bölenSayilar dizisine eklenen sayilar girinen sayi kapasitesinde bir dizi. Aralarda oluşan default 0'lar var.
                //Onları silmek için bu işlemi yapıyoruz.

                if(bolenSayilar[i]!=0){
                    System.out.print(bolenSayilar[i] + " , ");
                }

            }

        }




    }
}
