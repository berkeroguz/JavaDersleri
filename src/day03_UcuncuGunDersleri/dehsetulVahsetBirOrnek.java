package day03_UcuncuGunDersleri;

import java.util.Arrays;
import java.util.Scanner;

public class dehsetulVahsetBirOrnek {
    public static void main(String[] args) {

        /*
         Kullanıcıdan bir 5 metinsel ifadeli dizi isteyiniz.
          Sonra bu dizinin en uzun metninini ve en kısa metnini yazdırınız.

         */

        String [] metinler = new String[5]; // Dizi tanımlaması yapıldı.
        System.out.println(metinler.length); // Ekrana çıktısını yazdrdık.
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < metinler.length;i++){ // i 'yi neden 0 aldık da 1 almadık ? Length-1

            System.out.println("Lütfen "+ (i+1) +". metni giriniz.");
            metinler[i] = scan.nextLine();
        }

        System.out.println("Diziyi oluşturdunuz. Teşekkürler. Oluşturduğunuz dizi = " + Arrays.toString(metinler));

        String enKisaKelime= metinler[0];
        String enUzunKelime= metinler[0];

        for (int i=0;i<metinler.length;i++){ // Her bir elemanı tek tek dönüyor.

            if(metinler[i].length() > enUzunKelime.length()){
                enUzunKelime = metinler[i];
            }
            if (metinler[i].length() < enKisaKelime.length()) {
                enKisaKelime= metinler[i];
            }
        }

        System.out.println("En uzun kelime = "+ enUzunKelime);
        System.out.println("En kısa kelime = "+ enKisaKelime);





    }
}
