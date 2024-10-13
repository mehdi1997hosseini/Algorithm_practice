import java.util.Scanner;

public class HeightOfWell {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfTest, height, upWall, downWall;

        System.out.println("enter number of test :");
        numberOfTest = scanner.nextInt();

        for (int i = 1; i <= numberOfTest; i++) {
            upWall = scanner.nextInt();
            downWall = scanner.nextInt();
            height = scanner.nextInt();

            System.out.println("days of exist from wall : " + daysOfExitFromWall(upWall, downWall, height));
        }


    }

    public static int daysOfExitFromWall(int upWall, int downWall, int height) {
        int countDays = 0;
        int heightUpWall = 0;

        if (upWall>height)
            return countDays;

        if (upWall == height)
            return countDays + 1;

        while (true) {
            heightUpWall = heightUpWall + (upWall - downWall);
            if (heightUpWall >= height)
                break;
            countDays ++ ;
        }

        return countDays;
    }

}
