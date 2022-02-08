import java.util.Scanner;

public class MontyHall {
    public static void main(String[] args)
    {
        // Welcome the user
        System.out.println("Hello player!");
        System.out.println();

        // Create an array with door numbers
        int doors[] = {1, 2, 3};
        // Make sure array is set up correctly
        // TODO: remove once application is working
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Array element " + i + " is door: " + doors[i]);
        }
        System.out.println();

        // Choose which door the car will be behind
        // Use (int)(Math.random() * (max - min + 1) + min) to generate a random integer between a minimum and maximum value
        int carDoor = (int)(Math.random() * (3 - 1 + 1) + 1);

        // output carDoor for testing purposes
        // TODO: remove once we know application is running correctly
        System.out.println("The car is behind door: " + carDoor);
        System.out.println();

        // Explain the game to the user
        System.out.println("Behind one of the three doors you see in front of you is your dream car.");
        System.out.println("Behind the other two doors... goats");
        System.out.println();

        // Ask the user for their door choice
        System.out.println("Please choose a door (1-3): ");
        Scanner firstChoiceInput = new Scanner(System.in);
        int firstDoorChoice = firstChoiceInput.nextInt();
        System.out.println();

        // Output user choice
        System.out.println("You chose door: " + firstDoorChoice);

        // If the car door is chosen, open one of the other two doors
        if (firstDoorChoice == carDoor)
        {

        }
        // If a goat door is chosen, open the other goat door





    }
}
