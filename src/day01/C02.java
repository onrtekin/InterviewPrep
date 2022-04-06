package day01;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        /*
         * Kulanicidan alina bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay

         */
        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen bir String giriniz: ");
         String str=scan.nextLine();
        System.out.println("bir sayi giriniz : ");
        int sayi=scan.nextInt();
        ilkSonHarf(str,sayi);
        System.out.println(ilkSonHarf(str,sayi));

    }

    private static String ilkSonHarf(String str, int sayi) {

        String s=str.substring(0,1)+str.substring(str.length()-1);
        String b="";
        for (int i = 0; i <sayi ; i++) {
           b+=s;
        }return b;
    }
}
