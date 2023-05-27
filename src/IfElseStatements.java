import java.util.Scanner;

public class IfElseStatements {

    public static void main(String[] args) {

        // if - else
    /*
       ==   - Eşitse
       >=   - Büyük eşittir
       <=   - Küçük eşittir
       !=   - Eşit değilse
       &&   - ve operatorü
       ||   - ya da operatörü
     */
/*
        int a = 40;
        int b = 20;

        if ( a>b ){
            // a büyükse b'den buradaki kodlar çalışır.

            System.out.println("a sayısı b 'den büyüktür .");
        }
        else{
            System.out.println("a sayısı b'den büyük değildir ! ");
        }

        // Girilen 3 kenar uzunluğuna göre üçgenin eşkenar olup olmadığını belirleyen algoritmayı yazınız.

        // Kullanıcıdan veri istemek için konsolda "Scanner" class'ından yararlanırız.
        */

        Scanner scan = new Scanner(System.in);

        System.out.println(" Lütfen ilk kenar uzunluğunu giriniz =  ");
        int a=scan.nextInt(); // konsolda sayı girip a'ya atarım.

        System.out.println(" Lütfen ikinci kenar uzunluğunu giriniz = ");
        int b= scan.nextInt();  // konsolda girilen 2. sayıyı b'ye atar.

        System.out.println(" Lütfen üçüncü kenar uzulnuğunu giriniz = ");
        int c = scan.nextInt();  // konsolda girilen 3. sayıyı c'ye atar.

        // Eşkenar üçgen kenarları birbirine eşit üçgendir

        if(a==b && b==c) // a b'ye eşit ve b'de c'ye eşitse
        {
            System.out.println("Girilen uzunluklara göre eşkenar üçgendir.");
        }
        else {
            System.out.println("Girilen uzunluklara göre eşkanar üçgen değildir.");
        }


    }

}
