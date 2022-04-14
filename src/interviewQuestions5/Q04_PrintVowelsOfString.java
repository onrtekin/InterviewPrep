package interviewQuestions5;

import java.util.Scanner;

public class Q04_PrintVowelsOfString {
    //Get String from user and print just vowels(aeiou) inside String on the console
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
        System.out.print("String bir ifade giriniz  : ");
       String str= scan.nextLine().toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
        //2.yol
        String s=str.replaceAll("[^aeiou]","");
        System.out.println(s);
    }
}