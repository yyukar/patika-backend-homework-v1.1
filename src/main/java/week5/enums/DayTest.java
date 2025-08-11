package week5.enums;

import java.util.Scanner;

public class DayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day: ");
        String inputDayName = scanner.nextLine();
        System.out.println(Day.printDay(inputDayName));
    }
}
