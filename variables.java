package Test;

import java.util.Scanner;
import java.util.Arrays;

public class variables {
  public static void main(String[] args) {
    // Create a Scanner object to read input from the user
    Scanner scanner = new Scanner(System.in);

    // Create an array to store the numbers
    int[] numbers = new int[10];

    // Read 10 numbers from the user
    for (int i = 0; i < 10; i++) {
      System.out.print("Enter a number: ");
      numbers[i] = scanner.nextInt();
    }

    // Divide each even number by 2 and store the result in a new array
    int[] dividedNumbers = new int[10];
    for (int i = 0; i < 10; i++) {
      if (numbers[i] % 2 == 0) {
        dividedNumbers[i] = numbers[i] / 2;
      } else {
        dividedNumbers[i] = numbers[i];
      }
    }

    // Sort the array in ascending order
    Arrays.sort(dividedNumbers);

    // Print the sorted array
    System.out.println(Arrays.toString(dividedNumbers));
  }
}
