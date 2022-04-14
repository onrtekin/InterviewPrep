package interviewQuestions5;

import java.util.Scanner;

public class Q03_CountFactors {
    /*
      Type java code by using while loop,
     Write a program to count the factors of an integer which is entered by user.

*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi = Math.abs(scan.nextInt());
        int sayac = 0;
        int bolen = 1;

        while (bolen <= sayi) {
            if (sayi % bolen == 0 && sayi != bolen) {
                System.out.print(bolen + ","+(-bolen)+",");
                sayac++;
            }
            if (bolen == sayi) {
                System.out.print(bolen+","+(-bolen));
                sayac++;
            }
            bolen++;
        }
        System.out.print(" ==>" + sayac*2);
    }

}
