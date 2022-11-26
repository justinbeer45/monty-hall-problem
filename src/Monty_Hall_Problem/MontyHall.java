package Monty_Hall_Problem;
import java.util.*;



public class MontyHall {
    public static void main(String[] args)
    {
        // Welcome the user
        System.out.println();
        System.out.println("Hello player!");
        System.out.println();

        // instantiate player and door
        Player player = new Player();
        Doors doors = new Doors();


        // Choose which door the car will be behind
        doors.setCarDoor(doors.decideCarDoor());
        System.out.println("The car is behind door: " + doors.getCarDoor());


        // Explain the game to the user
        System.out.println("Behind one of the three doors you see in front of you is your dream car.");
        System.out.println("Behind the other two doors... goats");
        System.out.println();

        // Ask the user for their door choice
        System.out.print("Please choose a door (1-3): ");
        Scanner firstChoiceInput = new Scanner(System.in);
        player.setDoorChoice(firstChoiceInput.nextInt());
        System.out.println();

        // Output user choice
        System.out.println("You chose door: " + player.getDoorChoice());
        System.out.println();

        // decide which of the two non-chosen doors to open
        System.out.println("The host opens door " + doors.decideOpenDoor(player.getDoorChoice()) + " to reveal a goat!");

        // Ask player if they would like to change their choice of door
        System.out.println();
        System.out.println("Would you like to change your door guess?");
        System.out.println("No = 0");
        System.out.println("Yes = 1");
        System.out.print("Your choice: ");
        Scanner doorChangeInput = new Scanner(System.in);
        player.setChangeDoorChoice(player.decideDoorChange(doorChangeInput.nextInt()));

        // change player door choice if needed
        System.out.println("The player changed doors: " + player.getChangeDoorChoice());
        if (player.getChangeDoorChoice())
        {
            player.setDoorChoice(doors.changeDoorChoice(player.getDoorChoice()));
        }
        System.out.println("Your door is now door: " + player.getDoorChoice());

        // give the final result
        System.out.println("...");
        System.out.println("The car is behind door: " + doors.getCarDoor());
        // did the player win or lose
        if (player.decideWinOrLose(player.getDoorChoice(), doors.getCarDoor()))
        {
            System.out.println("You Won!!!");
        }
        else
        {
            System.out.println("You lost...");
        }

        System.out.println();

        System.out.println("Would you like to see how different choices affect your chances of winning?");
        System.out.println("No = 0");
        System.out.println("Yes = 1");
        System.out.print("Your choice: ");
        Scanner extraData = new Scanner(System.in);

        if (extraData.nextInt() == 1)
        {
            System.out.printf("If you never change doors you will win roughly %.2f%% of the time.%n",DecisionData.neverChangeDoors());
            System.out.printf("If you always change doors you will win roughly %.2f%% of the time.%n",DecisionData.alwaysChangeDoors());
        }
        else
        {
            System.out.println("Have a good day.");
        }
    }
}
