package IlkGunDersleri;

public class AritmetikIslemler {

    public static void main(String[] args) {
        // Aritmetik islemler toplama çıkarma bölme çarpma

        int a=20;
        int b=60;

        // Toplama
        int sonuc;
        String sonuc2;

        sonuc = a+b;

        sonuc2= String.valueOf(a+b);

        System.out.println("Integer sonuc = "+ sonuc);
        System.out.println("String sonuc = "+ sonuc2);

        // Çıkarma islemi

        sonuc = b-a; // 40

        // Çarpma işlemi

        sonuc = a*b;

        // Bölme işlemi

        sonuc = b/a;


        //Karmaşık işlemler

        sonuc = (a*b)/(a+b-a);
        System.out.println("işlem sonucu = > " + sonuc);

        // mod alma

        int sayi1 = 56;
        int sayi2 = 5;
        int modSonuc = sayi1 % sayi2;
        System.out.println(sayi1 + " sayisinin " + sayi2 + " sayisina bölümünden kalan =  "+ modSonuc);


    }
}
