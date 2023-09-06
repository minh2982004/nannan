package Common;

import java.util.Random;
import java.util.Scanner;

public class Library {

    public int getInt(String prompt, int min, int max) {
        int value = -1;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(prompt + ": ");
            try {
                String input = scanner.nextLine();
                value = Integer.parseInt(input);
                if (value >= min && value <= max) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number between " + min + " and " + max);
            }
        }
        return value;
    }

    public int[] createArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println();
    }
}
