package day02_IkinciGunDersleri;

import java.util.Scanner;

public class ElseIf {
    // Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
    // Erkek 65 yas ve uzeri emekli olabilir.
    // Cinsiyet ve yasini dikkate alarak
    // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

    // 1- Erkek ve 65 yaş üzeri ise........
    // 2- Erkek ve 65 yaş altı ise
    // 3- Kadın ve 60 yaş üzeri ise
    // 4- kadın ve 60 yaş altı ise
    public static void main(String[] args) {
        // true == 1
        // false == 0
        // a= 2 ; >>>> a>3 - false   a==2 - true
        // E-K
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen cinsiyet giriniz.");
        String cinsiyet = scanner.nextLine();
        System.out.println("Lütfen yaşınızı giriniz.");
        int yas=scanner.nextInt();

        if(cinsiyet.equals("E") && yas>=65 ){
            // 1- Erkek ve 65 yaş üzeri ise........
            System.out.println("Emekli olabilirsiniz,Tebrikler!");
        }
        else if(cinsiyet.equals("E") && yas<65){
            // 2- Erkek ve 65 yaş altı ise
            int sonuc=65-yas;
            System.out.println("Emekli olamazsınız. Emekli olmak için " + sonuc + " yıl daha çalışmanız gerekmektedir.");
            System.out.println("Emekli olamazsınız. Emekli olmak için " + (60-yas) + " yıl daha çalışmanız gerekmektedir.");

        }
        else if(cinsiyet.equals("K") && yas>=60){
            System.out.println("Emekli olabilirsiniz,Tebrikler!");
        }
        else if(cinsiyet.equals("K") && yas<60){
            // 4- kadın ve 60 yaş altı ise
            System.out.println("Emekli olamazsınız. Emekli olmak için "+ (60-yas)+" yıl daha çalışmanız gerekmektedir.");
        }
        else{
            // bizim durumlarımızın dışında olan bir şey
            System.out.println("Lütfen doğru bilgileri giriniz.");
        }
    }

}
