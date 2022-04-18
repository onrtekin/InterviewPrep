package interviewQuestions6;

import java.util.Scanner;

public class Q05_ExponentialNumber {
    //Get 2 numbers from the user.
    //first number base
    //second number Top
    //Write a code that calculates the prime of a number.
    // 2, 3 --> 2^3 = 2*2*2= 8

    // 4, 3 --> 4^3= 4*4*4 = 64

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("taban sayisini giriniz:  ");
        double tabanSayisi = scanner.nextDouble();
        System.out.print("us sayisini giriniz:  ");
        double usSayisi = scanner.nextDouble();

        System.out.println(Math.pow(tabanSayisi,usSayisi));


    }

}
