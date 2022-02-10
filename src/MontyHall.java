import java.util.*;


public class MontyHall {
    public static void main(String[] args)
    {
        // Welcome the user
        System.out.println("Hello player!");
        System.out.println();

        // Create a list with door numbers
        List<Integer> doors = new ArrayList<>();
        doors.add(1);
        doors.add(2);
        doors.add(3);
        // Make sure array is set up correctly
        // TODO: remove once application is working
        for (int i = 0; i < 3; i++)
        {
            System.out.println("List element " + i + " is door: " + doors.get(i));
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
        System.out.println();

        // If the car door is chosen, open one of the other two doors
        int randomDoorIndex;
        int firstRevealedDoor;
        int unchosenGoatDoor = 0;
        if (firstDoorChoice == carDoor)
        {
            doors.remove(firstDoorChoice - 1);
            System.out.println("Doors with car door removed " + doors);
            // randomly decide which goat door to open
            randomDoorIndex = (int)(Math.random() * (2 - 1 + 1) + 1);
            firstRevealedDoor = doors.get(randomDoorIndex);
            // add firstDoorChoice back to list of doors
            doors.add(firstDoorChoice);
            System.out.println("List of doors after first choice " + doors);
            System.out.println();

        }
        // If a goat door is chosen, open the other goat door
        else
        {
            for (int i = 0; i < 3; i++)
            {
                if (doors.get(i) != firstDoorChoice && doors.get(i) != carDoor)
                {
                    unchosenGoatDoor = doors.get(i);
                }
            }
            firstRevealedDoor = unchosenGoatDoor;
        }
        System.out.println("Door " + firstRevealedDoor + " reveals a goat behind it!");
        System.out.println();
        System.out.println("Would you like to change your door guess?");
        System.out.println("No = 0");
        System.out.println("Yes = 1");
        System.out.println("Your choice: ");
        Scanner doorChangeInput = new Scanner(System.in);
        int finalDoor = -1;
        if (doorChangeInput.nextInt() == 1)
        {
            for (int i = 0; i < 3; i++)
            {
                if (doors.get(i) != firstDoorChoice && doors.get(i) != firstRevealedDoor)
                {
                    finalDoor = doors.get(i);
                }
            }
            System.out.println("Your new door choice is door " + finalDoor);
        }
        else
        {
            finalDoor = firstDoorChoice;
            System.out.println("You stayed with door " + finalDoor);
        }




    }
}
