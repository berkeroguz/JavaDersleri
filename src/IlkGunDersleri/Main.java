package IlkGunDersleri;

public class Main {

    public static void main(String[] args) {

        // Alttaki kod sisteme "berker sümeyyeyi seviyor" yazar.
        /*
        Paragraf Yorum Satırı
         Paragraf Yorum Satırı Paragraf Yorum Satırı
          Paragraf Yorum Satırı
           Paragraf Yorum Satırı

         */

        // Java büyük harf küçük harfe duyarlı bir dildir. camelCase olayı.
        System.out.println("Berker Sümeyye'yi seviyor.");  // System class'ından > onun içindeki out değişkeni > println methodunu çağırıyor.

        // Kısayolu >> sout
        System.out.println("Kısa yoldan sout yazarak system.out.println yazıldı.");

        // ------------ Veri Tipleri ---------------
        //
        int a = 10;
        int b = 20;
        System.out.println(" Yukarıdaki a sayısının değeri =  " + a );
        System.out.println(" Yukarıdaki a ve b sayılarının toplamı = " + a+ " " +b );
        System.out.println("Yukarıdaki a ve sayılarının toplamı = "+ (a+b));

        String isim = "Sümeyye";
        String isim2 = "Berker";

        // Sout içerisinde "Sümeyye Berker'i seviyor" yazdıralım

        System.out.println(isim+isim2+"i seviyor"); //SümeyyeBerkeri seviyor
        System.out.println(isim + " " + isim2+"'i seviyor"); // Sümeyye Berker'i seviyor

    }

}
