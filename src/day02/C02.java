package day02;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        String strSayi = scan.nextLine();
        armstrongMethod(strSayi);
    }

    private static void armstrongMethod(String strSayi) {
        String basamak[]=strSayi.split("");
        int toplam=0;
        for (int i = 0; i < basamak.length; i++) {
            toplam+=Math.pow(Integer.valueOf(basamak[i]),basamak.length);

        }if(Integer.valueOf(strSayi)==toplam){
            System.out.println("bu bir armstrong sayidir");

        }else{
            System.out.println("armstrong sayi degildir");
        }





    }

}
