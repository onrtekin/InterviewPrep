package interviewQuestions6;

public class Q04_SurviveMonkey {
    	/*
		There is a lonely monkey in the island
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island
		Create following variables and find how many days
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;
		*/
        public static void main(String[] args) {

            int muzSayisi=165;
            int gunluk=4;
            int gunSayisi=0;
            int kalanMuzSayisi=0;

            do{
                kalanMuzSayisi=muzSayisi-gunluk;
                gunSayisi++;
                muzSayisi-=4;

            }while (kalanMuzSayisi>4);
            System.out.println(gunSayisi);

        }

}

