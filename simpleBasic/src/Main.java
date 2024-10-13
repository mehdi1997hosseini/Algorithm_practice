import java.math.BigInteger;
import java.util.*;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();

    public static void main(String[] args) {
//        getAmountArray(); // 1
//        System.out.println(firstOfNumber()); //2
//        reverseString(); // 3
//        maximumNumberInArray(); // 4
//        checkReverseString(); // 5
//        resultFactorialNumber(); // 6
//        evenOrOddNumber(); // 7
//        System.out.println(fibonacciSequenceMethod_1()); // 8
//        System.out.println(fibonacciSequenceMethod_2());; //8
//        greatestCommonDenominator();// 9
//        vowelsCharacter_method_1();
//        binarySearch();
//        multiplyTwoMatrices();
    }

    public static void getAmountArray() {
        System.out.println("enter length array : ");
        int lengthArray = scanner.nextInt();
        int totalNumber = 0;
        if (lengthArray > 0) {
            Integer[] arrayNumber = new Integer[lengthArray];

            for (int i = 0; i < arrayNumber.length; i++) {
                arrayNumber[i] = scanner.nextInt();
            }

            for (Integer number : arrayNumber) {
                totalNumber += number;
            }

            System.out.println(totalNumber);
        }
    }

    public static String firstOfNumber() {
        System.out.println("enter one number : ");
        int number = scanner.nextInt();
        if (number <= 0)
            return "number is not valid .... ";
        if (number == 1)
            return "first of number is trust";

        for (int i = 1; i < number; i++) {
            if (i != 1 && number % i == 0) {
                return "not first of number ...";
            }
        }

        return "entered number is  first of number ...";
    }

    public static String reverseString(String string) {

        char[] convertStringToCharArr = string.toCharArray();
        StringBuilder reverse = new StringBuilder();

        for (int i = convertStringToCharArr.length - 1; i >= 0; i--) {
            reverse.append(convertStringToCharArr[i]);
        }

        return reverse.toString();
    }

    public static void maximumNumberInArray() {
        System.out.println("enter one number for length array : ");
        int lengthArray = scanner.nextInt();
        int max = 0, min;

        Integer[] arrayNumbers = new Integer[lengthArray];

        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println("enter number ");
            arrayNumbers[i] = scanner.nextInt();
        }

        min = arrayNumbers[0];
        for (Integer number : arrayNumbers) {
            if (number > max)
                max = number;

            if (number < min)
                min = number;
        }


        System.out.println("maximum number is : " + max);
        System.out.println("minimum number is : " + min);

    }

    public static void checkReverseString() {
        System.out.println("just enter one word : ");
        String string = scanner.next();
        String reverse = reverseString(string);
        if (string.equals(reverse)) {
            System.out.println("is true.");
        } else {
            System.out.println("is false.");
        }
    }

    public static void resultFactorialNumber() {
        System.out.println("just enter The number : ");
        int integer = scanner.nextInt();
        BigInteger resultNumber = BigInteger.ONE;
        for (int i = integer; i > 1; i--) {
            resultNumber = resultNumber.multiply(BigInteger.valueOf(i));
            System.out.println("resultNumber: " + resultNumber);
        }
        System.out.println("final number is: : " + resultNumber);
    }


    public static void evenOrOddNumber() {
        System.out.println("just enter The One number : ");
        int number = scanner.nextInt();

        if (number % 2 == 0)
            System.out.println("even number ...");

        else
            System.out.println("odd number ...");

    }

    // method 1
    public static String fibonacciSequenceMethod_1() {
        System.out.println("length sequence fibonacci ");
        int lengthFibonacci = scanner.nextInt();

        int firstNumber = 0, secondNumber = 1, totalNumber = 0;
        StringBuilder totalFibonacci = new StringBuilder(firstNumber + " " + secondNumber + " ");

        if (lengthFibonacci <= 2 && lengthFibonacci > 0)
            return firstNumber + " " + secondNumber;

        for (int i = 3; i <= lengthFibonacci; i++) {
            totalNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = totalNumber;

            System.out.println(totalNumber);

            totalFibonacci.append(totalNumber).append(" ");
        }


        return totalFibonacci.toString();
    }

    // method 2
    public static String fibonacciSequenceMethod_2() {
        int firstNumber = 0, secondNumber = 1;

        System.out.println("length sequence fibonacci ");
        int lengthFibonacci = scanner.nextInt();

        if (lengthFibonacci <= 2 && lengthFibonacci > 0)
            return firstNumber + " " + secondNumber;

        int[] fibonacciArray = new int[lengthFibonacci + 1];
        fibonacciArray[0] = firstNumber;
        fibonacciArray[1] = secondNumber;

        System.out.println(fibonacciArray[0]);
        System.out.println(fibonacciArray[1]);

        for (int i = 2; i < fibonacciArray.length; i++) {
            fibonacciArray[i] = fibonacciArray[i - 2] + fibonacciArray[i - 1];
            System.out.println(fibonacciArray[i]);
        }

        return Arrays.toString(fibonacciArray);
    }


    public static void greatestCommonDenominator() {
        System.out.println("just enter The One number :");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                System.out.println(i);
        }

    }


    public static void vowelsCharacter_method_1() {
        char[] vowels = {'A', 'a', 'O', 'o', 'E', 'e', 'I', 'i', 'U', 'u'};

        System.out.println("just enter one word : ");
        String string = scanner.next();

        char[] convertStringToChar = string.toCharArray();

        int countVowelsWord = 0;

        for (char chr : convertStringToChar) {
            for (char vow : vowels) {
                if (chr == vow) {
                    countVowelsWord++;
                }
            }
        }

        System.out.println("count vowels word is : " + countVowelsWord);
    }

    public static void vowelsCharacter_method_2() {
        Set<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('a');
        vowels.add('O');
        vowels.add('o');
        vowels.add('E');
        vowels.add('e');
        vowels.add('I');
        vowels.add('i');
        vowels.add('U');
        vowels.add('u');

        System.out.println("just enter one word : ");
        String string = scanner.next();

        char[] convertStringToChar = string.toCharArray();

        int countVowelsWord = 0;
        for (char chr : convertStringToChar) {
            if (vowels.contains(chr)) {
                countVowelsWord++;
            }
        }

        System.out.println("count vowels word is : " + countVowelsWord);
    }

    public static void binarySearch() {
        System.out.println("just enter length Array : ");

        int integer = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("enter Your numbers: ");
        for (int i = 0; i < integer; i++) {
            list.add(scanner.nextInt());
        }
        Collections.sort(list);

        System.out.println(list);
        System.out.println("just enter Your number For Search : ");
        int searchNumber = scanner.nextInt();
        if (getBinarySearchList(0, list.size(), searchNumber, list) == searchNumber) {
            System.out.println("present :" + searchNumber);
        } else {
            System.out.println("nist");
        }
    }

    public static Integer getBinarySearchList(int start, int end, int searchNumber, List<Integer> list) {
        int average = (start + end) / 2;

        if (list.get(average) == searchNumber)
            return list.get(average);

        if (list.get(average) > searchNumber) {
            return getBinarySearchList(start, average, searchNumber, list);
        } else {
            return getBinarySearchList(average, end, searchNumber, list);
        }
    }

    public static void multiplyTwoMatrices() {
        System.out.println("just enter number of row matrices one : ");
        int rowMatricesOne = scanner.nextInt();
        System.out.println("just enter number of Column matrices one : ");
        int columnMatricesOne = scanner.nextInt();
        System.out.println("just enter number of row matrices two : ");
        int rowMatricesTwo = scanner.nextInt();
        System.out.println("just enter number of Column matrices two : ");
        int columnMatricesTwo = scanner.nextInt();

        if (columnMatricesOne != rowMatricesTwo)
            throw new RuntimeException("can not multiply two matrices because number of Column matrices one != number of row matrices two ");

        int[][] matricesOne = new int[rowMatricesOne][columnMatricesOne];
        int[][] matricesTwo = new int[rowMatricesTwo][columnMatricesTwo];

        int[][] matricesResult = new int[rowMatricesOne][columnMatricesTwo];

        System.out.println("============= insert data matrices one ===========");
        for (int i = 0; i < rowMatricesOne; i++) {
            for (int j = 0; j < columnMatricesOne; j++) {
                System.out.println("enter number for  row " + i + "column " + j);
//                matricesOne[i][j] = scanner.nextInt()
                int numberOfMatricesOne = random.nextInt(50);
                System.out.println("numberOfMatricesOne " + i + " - " + j + " : " + numberOfMatricesOne);
                matricesOne[i][j] = numberOfMatricesOne;
            }
        }

        System.out.println("============= insert data matrices two ===========");
        for (int i = 0; i < rowMatricesTwo; i++) {
            for (int j = 0; j < columnMatricesTwo; j++) {
                System.out.println("enter number for  row " + i + "column " + j);
                //                matricesOne[i][j] = scanner.nextInt()
                int numberOfMatricesTwo = random.nextInt(50);
                System.out.println("numberOfMatricesTwo " + i + " - " + j + " : " + numberOfMatricesTwo);
                matricesTwo[i][j] = numberOfMatricesTwo;
            }
        }

        System.out.println("============= insert data inside matrices result ===========");
        for (int i = 0; i < rowMatricesOne; i++) {
            for (int j = 0; j < columnMatricesTwo; j++) {
                for (int k = 0; k < columnMatricesOne; k++) {
                    // (matricesOne[i][j+1])*(matricesTwo[i+1][j]) + (matricesOne[i][j+1])*(matricesTwo[i+1][j])
                    matricesResult[i][j] += matricesOne[i][k] * matricesTwo[k][j];
                }
            }
        }

        System.out.println(Arrays.deepToString(matricesResult)
        );
    }


}
