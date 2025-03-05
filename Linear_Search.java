import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numbers = {45, 52, 64, 31, 75, 22};
        String[] names = {"Kartik", "Mayur", "Aditya", "Soham"};

        System.out.println("Given array of names is:");
        printArray(names);
        System.out.println("Given array of numbers is:");
        printArray(numbers);

        System.out.print("Enter the name for search: ");
        String targetName = in.nextLine();
        System.out.print("Enter the number for search: ");
        int targetNumber = in.nextInt();
        in.close();

        String resultName = linearSearchString(names, targetName);
        int resultNumber = linearSearchNumber(numbers, targetNumber);

        System.out.println("Result for name search: " + resultName);
        System.out.println("Result for number search: " + resultNumber);
    }
    static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
    static String linearSearchString(String[] names, String target) {
        if (names.length == 0) {
            return "Given array is not valid";
        }
        for (int i = 0; i < names.length; i++) {
            if (target.equals(names[i])) {
                System.out.println("Given target is at place " + i);
                return "Found: " + target;
            }
        }
        return "Enter valid input";
    }
    static int linearSearchNumber(int[] numbers, int target) {
        if (numbers.length == 0) {
            System.out.println("Array is not valid");
            return -1;
        }
        for (int index = 0; index < numbers.length; index++) {
            if (target == numbers[index]) {
                System.out.println("Given number is at point: " + index);
                return index;
            }
        }
        System.out.println("Number not found");
        return -1;
    }
}
