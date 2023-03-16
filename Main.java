import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int choice;

    do {
      System.out.println("Press 1 to learn about salary.");
      System.out.println("Press 2 to learn about the job.");
      System.out.println("Press 3 to learn about demand.");
      System.out.println("Press 4 to view current students.");
      System.out.println("Press 5 to quit.");
      System.out.print("Select number: \n");
      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.println("$98,345 average salary in Florida.\n");
          break;
        case 2:
          System.out.println("US News - 100 Best Jobs!.\n");
          break;
        case 3:
          System.out.println("Top 10 Forbes In-Demand Jobs.\n");
          break;
        case 4:
          System.out.println("List of current students:\n");
          try (BufferedReader a = new BufferedReader(new FileReader("Names.txt"))) {
            String line;
            while ((line = a.readLine()) != null) {
              System.out.println(line);
            }
            System.out.println();
          } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
          }
          break;
        case 5:
          System.out.println("Thanks for using this program.\n");
          break;
        default:
          System.out.println("\nInvalid choice. Please try again.\n\n");
          break;
      }
    } while (choice != 5);

    scanner.close();
  }
}