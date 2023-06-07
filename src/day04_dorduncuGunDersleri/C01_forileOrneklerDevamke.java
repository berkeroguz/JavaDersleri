package day04_dorduncuGunDersleri;

public class C01_forileOrneklerDevamke {
    public static void main(String[] args) {
        // Girilen metni ters olarak yazdıran programı yazınız.
        // örnek : berker >>> çıktısı >> rekreb

        String isim = "How can i go to taxim";

        // İndeks numarasını girerek gerekli metinden istenilen indexteki karakteri alabiliyoruz.
        char harf = isim.charAt(3);
        System.out.println(harf);
        //5 - 4 - 3 - 2 - 1 - 0
        String isimTers="";

        for (int i=isim.length()-1;i>=0;i--){
            isimTers=   isimTers    +   isim.charAt(i);
        }

        System.out.println(isim+ " isminin tersi = >> "+ isimTers);


    }
}
