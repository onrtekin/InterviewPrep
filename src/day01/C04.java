package day01;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        Scanner scan=new Scanner(System.in);

        String pin="said.12345";
        int girisHakki=4;

        System.out.println("*******HOSGELDİNİ**********");
        while(true){
            System.out.print("pin kodunuzu giriniz : ");
            String girilenPin=scan.nextLine();

            if(pin.equals(girilenPin)){
                System.out.println("basarili giris yaptiniz");
                break;
            }else{
                System.out.println("yanlis giris yaptiniz ");
                girisHakki--;
                System.out.println("kalan giris hakkiniz : "+girisHakki);

            }if (girisHakki==0){
                System.out.println("giris hakkiniz bitmistir kartiniz blocke oldu");
            break;
            }
        }
    }
}
