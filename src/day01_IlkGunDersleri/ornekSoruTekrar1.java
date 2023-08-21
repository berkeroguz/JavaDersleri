package day01_IlkGunDersleri;

import java.util.Scanner;

public class ornekSoruTekrar1 {
    public static void main(String[] args) {
        // Kullanıcıdan 1. sınav 2. sınav ve 3. sınav notlarını alarak öğrencinin ortalamasını bularak
        // sınavı geçip ya da kaldığını bildiren bir algoritmayı yazınız.

        //Kullanıcı Hikayesi ( User Story )
        /*
            UserStory = Öğrenci sınav notlarını alarak ortalamasına göre geçip kaldığını belirlemek istiyorum.

            Acceptance Criteria / Kabul Kriterleri


             - 0-24 arası notu 0 olsun
             - 25-49 arası notu 1 olsun
             - 50- 59 arası notu 2 olsun
             - 60-69 arası notu 3 olsun
             - 70-84 arası notu 4 olsun
             - 85 - 100 arası notu 5 olsun

             //- Kullanıcıdan sadece 0 ve 100 arasındaki değerler alınacaktır.
             // Bu madde için döngü lazım. Neden ? Çünkü bir şart gerçekleşene kadar o işlemin yapılması ve kon trol edilmesi lazım.
             - Not ortalaması 50'nin üzerindeyse geçti altındaysa kaldı olacak.
         */

        // Scanner Kullanarak kullanarak notları alalım
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen 1. sınav notunu giriniz");
        int ilkSinav = scan.nextInt();  // camelCase

        System.out.println("Lütfen 2. sınav notunu giriniz.");
        int ikinciSinav = scan.nextInt();

        System.out.println("Lütfen 3. sınav notunu giriniz.");
        int ucuncuSinav = scan.nextInt();

        // Bilgisayar nasıl çalışır ? Girdi / işlem / Çıktı olarak gerekli bilgileri sağlayan elektronik bir chazid.

        // Business Kuralları ( İş Kuralları )
        int ortalamaSonuc = (ilkSinav+ikinciSinav+ucuncuSinav) / 3;

        //- 0-24 arası notu 0 olsun
        if (ortalamaSonuc>0 && ortalamaSonuc<25){
            System.out.println("Öğrenci not ortalaması = " + ortalamaSonuc);
            System.out.println("Öğrencinin ders notu = 0");
            System.out.println("Öğrenci dersten KALDI !");
        }
        //- 25-49 arası notu 1 olsun
        else if (ortalamaSonuc>24 && ortalamaSonuc <50) {
            System.out.println("Öğrenci not ortalaması = " + ortalamaSonuc);
            System.out.println("Öğrencinin ders notu = 1 ");
            System.out.println("Öğrenci dersten KALDI !");
        }

        //- - 50- 59 arası notu 2 olsun
        else if (ortalamaSonuc>49 && ortalamaSonuc <60) {
            System.out.println("Öğrenci not ortalaması = " + ortalamaSonuc);
            System.out.println("Öğrencinin ders notu = 2 ");
            System.out.println("Öğrenci dersten GEÇTİ !");
        }
       // - 60-69 arası notu 3 olsun
        else if (ortalamaSonuc>59 && ortalamaSonuc <70) {
            System.out.println("Öğrenci not ortalaması = " + ortalamaSonuc);
            System.out.println("Öğrencinin ders notu = 3 ");
            System.out.println("Öğrenci dersten GEÇTİ !");
        }
// - 70-84 arası notu 4 olsun
        else if (ortalamaSonuc>69 && ortalamaSonuc <85) {
            System.out.println("Öğrenci not ortalaması = " + ortalamaSonuc);
            System.out.println("Öğrencinin ders notu = 4 ");
            System.out.println("Öğrenci dersten GEÇTİ !");
        }
        // - 85-100 arası notu 5 olsun
        else if (ortalamaSonuc>84 && ortalamaSonuc <= 100) {
            System.out.println("Öğrenci not ortalaması = " + ortalamaSonuc);
            System.out.println("Öğrencinin ders notu = 5 ");
            System.out.println("Öğrenci dersten GEÇTİ !");
        }
        else {
            System.out.println("Öğrenci not ortalaması = " + ortalamaSonuc);
            System.out.println("Geçersiz veriler girildiği için ortalama hesaplanamamıştır.");

        }

    }
}
