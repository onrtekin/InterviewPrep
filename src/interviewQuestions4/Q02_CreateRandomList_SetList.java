package interviewQuestions4;

import java.util.ArrayList;

public class Q02_CreateRandomList_SetList {
    // int array list oluşturun 10 elemandan oluşmalı
// random ekle isinde void bir metod oluşturun  ve parametresi int array list olsun.
// bu metod array list içinde 0' dan 20 ye kadar değer atasın.
// eğer çift sayı atarsa o elemaının yerine 111 yazsın
// eğer çift sayı yoksa çift sayı yoktur mesajını versin.
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        randomEkle(list);
    }

    private static void randomEkle(ArrayList<Integer> list) {
        for (int i = 0; i < 3; i++) {
            list.add((int) (Math.random() * 20));
        }
        int sayac=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.set(i, 111);
                sayac++;

            }

        }if(sayac==0){
            System.out.println("Cift sayi yoktur");
        }
        System.out.println(list);

    }
}
