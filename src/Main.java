import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      int age = 0;
      String trash = "";
        System.out.print("Enter your age: ");
        if(in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine(); // Clear the buffer
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nYou must enter a valid number not " + trash);
            System.out.println("Run the program again!");
            System.exit(0);
        }
        // if we get here we have an age
        System.out.println("You told me your age is " + age);
    }
}