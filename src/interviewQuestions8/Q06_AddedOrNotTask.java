package interviewQuestions8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q06_AddedOrNotTask {

    // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
    // count how many duplicates we have
    // find out what are the duplicated values

    // 1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
    // kaç tane kopyamız olduğunu sayin
    // yinelenen değerlerin ne olduğunu öğrenin
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(4);
        sayilar.add(5);
        sayilar.add(3);
        int tekrarliElemanSayisi=0;
        Set<Integer> tekOlanlar=new HashSet<>();
        List<Integer>tekrarliElemanlar=new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            boolean ekliMi=tekOlanlar.add(sayilar.get(i));//ekli olma durumu uniqe elemanlarda var olmasidir
            if(!ekliMi){//unique elemanlara eklenmediyse o eleman duplicate tir.
                tekrarliElemanSayisi++;
                tekrarliElemanlar.add(sayilar.get(i));
            }

        }
        System.out.println("Tekrarli eleman Sayisi  : "+tekrarliElemanSayisi);
        System.out.println("Tekrarlanan Elemanlar : "+tekrarliElemanlar);

    }
}
