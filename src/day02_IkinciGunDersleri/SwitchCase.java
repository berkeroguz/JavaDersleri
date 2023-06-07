package day02_IkinciGunDersleri;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        // If-else switch case'in kullanılabildiği her durumda kullanılır.
        // sayi 1 ise = Sayı birdir yazsın
        // Sayi 2 ise = sayı ikidir yazsın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz!");
        int sayi = scan.nextInt();

        switch (sayi){
            case 1:
                System.out.println("Sayı birdir.");
                // buraya 'sayi' degiskeni 1 ise işlem görecek kodlar yazılı
                break;
            case 2:
                // buraya 'sayi' degiskeni 2 ise işloem gerecek kodlar yazılır
                System.out.println("Sayı ikidir");
                break;
            default:
                //Buraya da istenilen durumların dışında bir değer girildiğinde hangi kodlar çalışacaksa o kodlar yazılır.
                System.out.println("Sayı ne birdir ne ikidir. Lütfen bir daha giriniz.");
        }


    }
}
