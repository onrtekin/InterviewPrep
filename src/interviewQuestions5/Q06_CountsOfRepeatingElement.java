package interviewQuestions5;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_CountsOfRepeatingElement {
    /*
            How many times a given number is repeated in a sequence
            Create the Java program that finds it.
     */

    public static void main(String[] args) {
        int arr[] = {1, 1, 22, 22, 45, 85, 41, 41};
        Scanner scan = new Scanner(System.in);
        System.out.print("aramak istediginiz sayiyi giriniz : ");

        int aranilanSayi=scan.nextInt();
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if(aranilanSayi==arr[i]){
                sayac++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("aradigini sayi : "+aranilanSayi+"---> "+sayac+" defa gecmektedir");



    }
}
