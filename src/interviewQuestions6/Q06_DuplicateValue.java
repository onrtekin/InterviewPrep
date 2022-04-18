package interviewQuestions6;


import java.util.ArrayList;
import java.util.List;

public class Q06_DuplicateValue {
       /*
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */

    public static void main(String[] args) {
        String str = "Javaisalsoeasyyi";
        List<String> list = new ArrayList<>();
        int sayac = 0;
        for (int i = 0; i < str.length(); i++) {
            sayac = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.substring(i, i + 1).equals(str.substring(j, j + 1))) {
                    sayac++;
                }
                if (sayac > 1 && !list.contains(str.substring(i, i + 1))) {
                    list.add(str.substring(i, i + 1));
                }
            }
        }
        System.out.println(list);


    }
}

