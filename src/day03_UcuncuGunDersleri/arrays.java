package day03_UcuncuGunDersleri;

public class arrays {
    public static void main(String[] args) {

        // Diziler / Arrays



        int [] diziOrnek = {1,2,3,4,5};
        System.out.println("Dizinin 1. indeksindeki eleman =  "+diziOrnek[1]);
        System.out.println("Dizinin 1. indeksindeki eleman =  "+diziOrnek[0]);
        //diziOrnek[6]=5;

        String [] isimler = {"Berker","Sümeyye","Aykut","Hasan","Ahmet","Mehmet","Ayşe"};
        // Soru 1 = Yukarıdaki dizi kaç elemanlıdır ? 7
        // Soru 2 = Yukarıdaki dizinin son indeks numaraıs kaçtır ? 6
        // Soru 3 = Yukarıdaki dizinin ilk indeks numarası kaçtır ? 0
        // Soru 4 = Yukarıdaki dizinin 3. indeksindeki eleman hangi elemandır ? Hasan


        String [] adlar = new String[10];
        adlar[6]="Berker";
        System.out.println("Adlar dizisinin 6. elamanı = " + adlar[6]);




    }

}
