import java.util.*;

public class snacks {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static final Integer[] game = {103, 189, 46, 160, 158, 197, 115, 46, 213, -6, 183, 16, 40, 15, 209, 145, 6, 98, 7, 172, 138, -13, 212, 212, 181, 151, -11,
            -22, -8, 180, 149, 23, -13, 150, 174, -6, -20, 132, 179, 37, 41, 199, -12, 153, 148, 129, -22, 73, 119, 175, 52, 101, 7,
            59, 31, 15, 34, 173, 161, -22, 64, -15, 20, 42, 63, 139, 63, 5, 91, 68, 14, 90, 109, 154, 154, 12, 123, 123, 78, 162, 30, 16, 13,
            -39, -7, 118, 5, 44, -28, -48, 83, -51, -50, 93, 88, 21, -21, 35, 139, 8, -99, -95, -13, -80, 91, -95, -56, -44, 31, 24, 56, -102,
            -55, -55, -3, 60, 7, 29, -52, -51, -20, -60, -88, -1, 2, 95, -57, 98, 20, 39, 84, -51, -40, 74, 8, -7, 49, 52, -76, 25, -107, -120,
            -59, 51, -140, -94, 38, -38, -44, 69, 92, 20, -22, 19, 85, -138, 31, 69, -62, 63, -59, -143, 18, -50, -93, -48, 22, -154, 61, -44, -23,
            -164, 25, -161, -131, 71, -78, -138, -1, -9, -180, -36, 31, -181, -96, -7, -112, 25, -162, 47, -84, 15, -125, -157, -86, -109, -147,
            -142, -153, -100, -59, -44, 13, 28, -148, 11, -133, -71, -176, -91, -67, -92, -147, 20, -121, -61, -181, -52, -140, -64, -141, -207,
            -158, -79, 20, -72, -28, -87, -181, 3, -192, -30, 6, -82, -84, 10, -102, -26, -100, -125, -209, -230, -93, -33, -150, -2, -248};


    public static final Integer[] game1 = {56, 86, 46, 17, 5, 115, 1, 45, 45, 70, 33, 33, -8, 10, 47, 70, 46, 99, 1, 85, -6, 9, 62, -6, 33, 38, 57, 27, 17, 69, -27, 65, -14, -23,
            78, -11, 33, 41, -32, -13, -7, 49, -8, -22, -12, 5, 59, 23, -6, -10};


    public static final Integer[] game2 = {54, 32, 34, 18, 44, 67, 19, 23, 19, 53, 10, 45, 7, -2, -1, -6, 22, 26, 4, 22, 27, 37, 17, 38, 2, 41, 47, 25, -11, 24, 5, -21, 14, -1, -5, 9,
            -18, 31, 26, -38, 10, -18, 27, -39, -28, -40, -40, -35, -6, -25, 15, -37, 3, 6, -26, -6, 4, -6, -21, -28, -45, 10, -55, -23, -56, -62, -9, -4, -68, -35, -68, -1, -5, -75};

    public static final Integer[] game3 = {9, 45, 60, 8, 1, 32, -2, 6, 24, 44, 45, 52, 9, 34, 50, 14, 24, 52, -3, 22, -13, 52, -6, 51, 43, 41, 34, 7, 8, 15, -28, 23, -13, -15, 27, -8,
            32, 6, -8, 32, -15, -29, -19, 29, 15, -17, -8, 29, -42, -23, 25, -16, -4, -43, -21, -33, 9, -33, -1, -20, -8, -19, -17, -14, -8, -57, -8, 3, -51, -18, -56, -71, -41, -53, -24, -72, -78};

    public static final Integer[] game4 = {56, 86, 46, 17, 5, 115, 1, 45, 45, 70, 33, 33, -8, 10, 47, 70, 46, 99, 1, 85, -6, 9, 62, -6, 33, 38, 57, 27, 17, 69, -27, 65, -14, -23,
            78, -11, 33, 41, -32, -13, -7, 49, -8, -22, -12, 5, 59, 23, -6, -10, 60, -38, 14, 35, 45, 16, -10, 15, 17, 21, -35, 16, -62, 50, 47, 26, 27, 35, -8, -20, -12, -63, 42, 3, 18,
            31, -9, -12, -63, -24, -6, -22, 19, 36, 11, 33, -59, 28, -48, 20, -61, -18, -91, 24, -89, -14, -55, -3, -51, 4, -32, -50, -86, -72, 4, -16, -70, -79, -86, -72, -24, -100,
            -74, -101, -112, -18, -9, -35, -18, -55, -122};


    public static void main(String[] args) {
//        int length = lengthArray(1, 100);
//        System.out.println(length);
//        int length = 120;

//        create array by length random
//        Integer[] game = new Integer[length];

//        insert inside array
//        for (int i = 0; i < game.length; i++) {
//            game[i] = randomNumber(-length + 1, length - 1);
//        }

//        System.out.println(game.length); // 247
//        System.out.println(game1.length); // 50
        System.out.println(game4.length); // 74
//        System.out.println(game3.length); // 77
//        System.out.println(game4.length); // 121


        System.out.println(Arrays.toString(game4));
        System.out.println("start game '' enter '' ");
        scanner.nextLine();

//        resultStepOneOfGame(game4);
        resultStepTwoOfGame(game4);


    }

    public static void resultStepOneOfGame(Integer[] game) {
        boolean retry = true;
        String resultGame = "";
        while (retry) {

            // 0 _ length-1
            Integer rollDice = lengthArray(0, game.length - 1);
            System.out.println(rollDice);

            resultGame = startGame(game, rollDice);
            if (!resultGame.contains("YOU LOSE"))
                retry = false;
            else {
                System.out.println(resultGame);
                System.out.println("TRY AGAIN .... \n");
            }
        }
        System.out.println(resultGame);
    }

    public static void resultStepTwoOfGame(Integer[] game) {
        int max = 0;
        int roleDice = 0;
        Map<Integer, Integer> maximumResult = new HashMap<>();
        for (int i = 0; i < game.length; i++) {
            System.err.println("number =>  " + i);
            int tryRollDice = maxTryRollDice(game, i);
            if (tryRollDice != 0) {
                maximumResult.put(i, tryRollDice);
                if (max < tryRollDice) {
                    roleDice = i;
                    max = tryRollDice;
                }
            }
        }


        System.out.println("hash Map :=> \t\t" + maximumResult);
    }

    public static Integer lengthArray(int bound1, int bound2) {
        //make sure bound2> bound1
        int min = Math.min(bound1, bound2);
        int max = Math.max(bound1, bound2);
        //math.random gives random number from 0 to 1
        return min + ((int) (Math.random() * (max - min)));
    }

    public static Integer randomNumber(int min, int max) {
        int randomNumber;
        do {
            randomNumber = random.nextInt((max - min) + 1) + min;
        } while (randomNumber == 0); // اگر عدد صفر بود، دوباره عدد تولید می‌شود

        return randomNumber;
    }


    public static String startGame(Integer[] game, int numberOfDice) {
        int rollDice = numberOfDice;
        int counter = 0;
        int countTry = 0;
        while (counter >= 0 && counter < game.length) {
            Integer nextStep = game[numberOfDice];

            if (nextStep > 0) {
                numberOfDice = nextStep + numberOfDice;
                counter = numberOfDice;
                countTry += 1;
            } else {
                numberOfDice = nextStep + numberOfDice;
                counter = numberOfDice;
                countTry += 1;
            }

            if (counter == game.length) {
                return "YOU WIN ... => try it after " + countTry * rollDice;
            }

            System.out.println("counter : " + counter + "\t\t countTry : " + countTry);
            if (countTry == game.length)
                break;
        }

        return "YOU LOSE .... => try it after " + countTry;
    }

    public static Integer maxTryRollDice(Integer[] game, int numberOfDice) {
        int rollDice = numberOfDice;
        int counter = 1;
        int countTry = 0;
        while (counter >= 0 && counter < game.length) {
            Integer nextStep = game[numberOfDice];
            if (nextStep > 0) {
                numberOfDice = nextStep + numberOfDice;
                counter = numberOfDice;
                countTry += 1;
            } else {
                numberOfDice = nextStep + numberOfDice;
                counter = numberOfDice;
                countTry += 1;
            }

            if (counter == game.length) {
                return countTry * rollDice;
            }

            System.out.println("counter : " + counter + "\t\t countTry : " + countTry);
            if (countTry == game.length)
                break;
        }

        System.out.println("roleDice : " + rollDice + " \t countTry : " + countTry);
        return 0;
    }


}
