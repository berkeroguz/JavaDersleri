package day03_UcuncuGunDersleri;

public class nestedForLoops {
    public static void main(String[] args) {

        // Bunun döngü sayısını kullanıcıdan alarak , işlem yapan halini yazınız.

        for ( int i = 1; i<=5; i++){ // her satır için işlem yapma olanağı sağlar

            for (int a=0; a<i;a++){ // her satırda yukarıdaki i'ye kadar döngü sağlar.
                System.out.print("*");
            }

            System.out.println("");

        }

    }


    }

