import java.util.Random;
import java.util.Scanner;
class SwitchChoice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("skriv in en siffra för att spela respektive spel eller tryck på e för att avbryta");

        String choice;
        while (true) {
            System.out.println("1. Upp och Ner ");
            System.out.println("2. Min Max ");
            System.out.println("3. Sten Sax Påse ");
            System.out.println("4. Ordning och reda ");
            System.out.println("e. Avsluta ");


            choice = input.nextLine();


            switch (choice) {

                case "1":
                {
                    System.out.println("Ge 3 imputs, allt efter det tredje ignoreras");

                    java.util.Scanner in = new java.util.Scanner(System.in);


                    String rad1 = in .next();
                    String rad2 = in .next();
                    String rad3 = in .next();

                    in .nextLine();

                    System.out.println("END");
                    System.out.println("" + rad3);
                    System.out.println("" + rad2);
                    System.out.println("" + rad1);

                }
                break;

                case "2":
                {

                    try {

                        int n,
                                temp;

                        Scanner sc = new Scanner(System.in);


                        System.out.println("skriv 5 siffror, allt efter det femte ignoreras");

                        n = 5;

                        int a[] = new int[n];


                        for (int i = 0; i < n; i++) {

                            a[i] = sc.nextInt();

                        }

                        for (int i = 0; i < n; i++) {

                            for (int j = i + 1; j < n; j++) {

                                if (a[i] > a[j]) {

                                    temp = a[i];

                                    a[i] = a[j];

                                    a[j] = temp;

                                }

                            }

                        }

                        System.out.println("största:" + a[n - 1]);


                        System.out.println("minsta:" + a[0]);

                    }

                    catch (Exception e){
                        System.out.println("Ogiltig inmatning programmet omstartas");
                    }

                }
                break;

                case "3":
                {

                    try {


                        Scanner scan = new Scanner(System.in);

                        Random rand = new Random();

                        int userScore = 0;

                        int cpuScore = 0;


                        while (true) {

                            System.out.println("Skriv 1 för sten 2 för papper och 3 för sax");

                            int userChoice = scan.nextInt();

                            int cpuChoice = rand.nextInt(3) + 1;

                            if (userChoice < 1){
                                System.out.println("ogiltig inmatning, prova igen");
                            }

                            if (userChoice > 3){
                                System.out.println("ogiltigt inmatning, prova igen");
                            }

                            if (cpuChoice == userChoice) {

                                System.out.println("Lika");
                                System.out.printf("Datorns poäng: %d\nDina poäng: %d\n", cpuScore, userScore);


                            } else if (userChoice == 1) {

                                if (cpuChoice == 2) {

                                    System.out.println("Du van inte");

                                    cpuScore++;

                                    System.out.printf("Datorns poäng: %d\nDina poäng: %d\n", cpuScore, userScore);


                                } else if (cpuChoice == 3) {

                                    System.out.println("Du van");

                                    userScore++;

                                    System.out.printf("Datorns poäng: %d\nDina poäng: %d\n", cpuScore, userScore);


                                }


                            } else if (userChoice == 2) {

                                if (cpuChoice == 1) {

                                    System.out.println("Du van");

                                    userScore++;

                                    System.out.printf("Datorns poäng: %d\nDina poäng: %d\n", cpuScore, userScore);


                                } else if (cpuChoice == 3) {

                                    System.out.println("Du van inte");

                                    cpuScore++;

                                    System.out.printf("Datorns poäng: %d\nDina poäng: %d\n", cpuScore, userScore);


                                }


                            } else if (userChoice == 3) {

                                if (cpuChoice == 1) {

                                    System.out.println("Du van inte");

                                    cpuScore++;

                                    System.out.printf("Datorns poäng: %d\nDina poäng: %d\n", cpuScore, userScore);


                                } else if (cpuChoice == 2) {

                                    System.out.println("Du van");

                                    userScore++;

                                    System.out.printf("Datorns poäng: %d\nDina poäng: %d\n", cpuScore, userScore);


                                }


                            }

                            if (cpuScore == 3) {
                                System.out.println("");
                                System.out.println("Du van inte spelet");

                                System.out.printf("Datorns poäng: %d\nDina poäng: %d\n", cpuScore, userScore);

                                break;


                            }
                            if (userScore == 3) {

                                System.out.println("");
                                System.out.println("Du van spelet");

                                System.out.printf("Datorns poäng: %d\nDina poäng: %d\n", cpuScore, userScore);

                                break;

                            }

                        }

                    }


                    catch (Exception e){
                        System.out.println("Ogiltig inmatning programmet omstartas");
                    }



                }
                break;

                case "4":
                {
                    try {

                        int n,
                                temp;

                        int t = 0;


                        Scanner s = new Scanner(System.in);


                        System.out.println("skriv 5 siffror, alla siffror efter den femte ignoreras");


                        n = 5;

                        int a[] = new int[n];


                        for (int i = 0; i < n; i++) {

                            a[i] = s.nextInt();

                        }


                        if (a[0] < a[1]) {
                            t++;
                        } else {
                            System.out.println(" ");
                        }
                        if (a[1] < a[2]) {
                            t++;
                        } else {
                            System.out.println(" ");
                        }
                        if (a[2] < a[3]) {
                            t++;
                        } else {
                            System.out.println(" ");
                        }
                        if (a[3] < a[4]) {
                            t++;
                        } else {
                            System.out.println(" ");
                        }


                        if (t == 4) {
                            System.out.println("talen är i ordning");
                        } else {
                            System.out.println("talen är inte i ordning");
                        }


                        for (int i = 0; i < n; i++) {


                            for (int j = i + 1; j < n; j++) {

                                if (a[i] > a[j]) {

                                    temp = a[i];

                                    a[i] = a[j];

                                    a[j] = temp;

                                }

                            }

                        }


                        System.out.println("Largest:" + a[4]);

                        System.out.println("Second Largest:" + a[3]);

                        System.out.println("Smallest:" + a[0]);

                        System.out.println("Second Smallest:" + a[1]);

                        int sum = a[0] + a[1] + a[2] + a[3] + a[4];

                        System.out.println(" summan är " + (sum));


                    }

                    catch(Exception e){
                        System.out.println("Ogiltig inmatning programmet omstartas");
                    }
                }
                break;

                case "e", "E":
                    System.exit(0);
                    break;


                default:
                    System.out.println("skriv rätt val");
                    break;
            }
        }
    }
}