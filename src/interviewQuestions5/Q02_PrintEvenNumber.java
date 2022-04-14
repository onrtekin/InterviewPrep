package interviewQuestions5;

import java.util.Scanner;


public class Q02_PrintEvenNumber {
    /*
    Write a method named isEven that accepts an integer argument.
    The method should return true if the argument is even, or false otherwise.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi Giriniz : ");
        int sayi = scan.nextInt();
        boolean ciftSayiMi = ciftSayiMi(sayi);
        System.out.println(ciftSayiMi);
    }

    private static boolean ciftSayiMi(int sayi) {
        boolean ciftSayiMi = false;
        if (sayi % 2 == 0) {
            ciftSayiMi = true;
        }
        return ciftSayiMi;
    }
}