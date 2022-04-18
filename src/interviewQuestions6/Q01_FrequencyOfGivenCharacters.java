package interviewQuestions6;

public class Q01_FrequencyOfGivenCharacters {
	/*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.

   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */

    public static void main(String[] args) {

        String str = "AAABBCCCCDDD";
        frekans(str);

    }

    private static void frekans(String str) {
        int sayac = 0;
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            sayac = 0;
            for (int j = i; j < str.length() ; j++) {
                if (str.substring(i, i + 1).equals(str.substring(j, j + 1))) {
                    sayac++;
                }
            }
            if (!output.contains(str.substring(i, i + 1))) {
                output += str.substring(i, i + 1) + sayac;

            }
        }
        System.out.println("output : " + output);
    }

}
