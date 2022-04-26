package interviewQuestions9;

import java.util.HashMap;
import java.util.Map;

public class Q01_MapKeysValues {
    //5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
    //5 tane ulke ismi ve nufusunu yazdırıyoruz(country)
    //5 tane ulke ismi yazdırıyoruz. (keyset())
    //5 tane ulke nufusunu yazdırıyoruz. (values())
    //nüfusların toplamını yazdırın.
    //kaç tane 50 milyondan fazla nüfuslu ülke var?
    // ulke ve nufus  lari hem map gibi..hem de ayri ayri yazdirma ?
    public static void main(String[] args) {
        HashMap<String, Integer> ulke = new HashMap<String, Integer>();
        ulke.put("Almanya",80);
        ulke.put("Turkiye",83);
        ulke.put("Amerika",350);
        ulke.put("Fransa",65);
        ulke.put("Kanada",40);
        ulke.put("Ispanya",55);
        ulke.put("Avusturya",12);
        System.out.println("Ulke isimleri ve Nufuslari : "+ulke+" milyondur");
        System.out.println("Ulke Isımleri"+ulke.keySet());
        System.out.println("Ulke Nufuslari : "+ulke.values());

        int sayac=0;
        for (Integer buyukMu: ulke.values()) {
            if(buyukMu>50){
                sayac++;
            }
        }
        System.out.println("50 milyondan fazla "+sayac+" tane ulke vardir");
        int toplamNufus=0;
        for (Integer each: ulke.values()) {
            toplamNufus+=each;

        }
        System.out.println("Ulkelerin Nufuslari Toplami  :"+toplamNufus+" milyondur");
    }

}
