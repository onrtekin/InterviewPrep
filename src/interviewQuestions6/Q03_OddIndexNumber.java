package interviewQuestions6;


import java.util.Scanner;

public class Q03_OddIndexNumber {
    // indexi tek sayi olan karakterleri yazdiran bir code create ediniz
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("bir ifade giriniz :");
        String str= scan.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if(i%2!=0){
                System.out.print(str.charAt(i));
            }
        }
    }

}
