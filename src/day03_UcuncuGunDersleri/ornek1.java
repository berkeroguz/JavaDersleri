package day03_UcuncuGunDersleri;

import java.util.Arrays;

public class ornek1 {
    // 5 elemanlı bir sayısal dizinin, her bir elemanını 2 arttırarak kaydedin ve ekrana yazdırın.

    public static void main(String[] args) {
        int [] sayilar = {1,2,3,4,5};
/*
        sayilar[0] = sayilar[0] + 2;
        sayilar[1] = sayilar[1] + 2;
        sayilar[2] = sayilar[2] + 2;
        sayilar[3] = sayilar[3] + 2;
        sayilar[4] = sayilar[4] + 2;

*
 */        // Dizinin ilk hali
        System.out.println(Arrays.toString(sayilar));  // Arrays.toString( diziAdı ) seklinde kullanılır.

        // Arttırma işlemi
        for (int i = 0 ; i<sayilar.length;i++){
            sayilar[i] = sayilar[i] +2;
        }

        System.out.println("Sayilar dizisi = " + sayilar.length + "'dır."); // 5

        // Dizinin son hali
        System.out.println(Arrays.toString(sayilar));

    }


}
