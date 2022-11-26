package Monty_Hall_Problem;

public class DecisionData {

    private static final int iterations = 100000;

    private static int chooseFirstDoor()
    {
        int carDoor;
        carDoor = (int)(Math.random() * (3 - 1 + 1) + 1);
        return carDoor;
    }

    public static double neverChangeDoors()
    {
        int wins = 0;
        for (int i = 0; i < iterations; i++)
        {
            Doors doors = new Doors();
            Player player = new Player();

            // Choose which door the car will be behind
            doors.setCarDoor(doors.decideCarDoor());

            // Pick a door
            player.setDoorChoice(chooseFirstDoor());

            // did the player win or lose
            if (player.decideWinOrLose(player.getDoorChoice(), doors.getCarDoor()))
            {
                wins += 1;
            }
        }
        return ((float)wins / iterations) * 100;
    }

    public static double alwaysChangeDoors()
    {
        int wins = 0;
        for (int i = 0; i < iterations; i++)
        {
            Doors doors = new Doors();
            Player player = new Player();

            // Choose which door the car will be behind
            doors.setCarDoor(doors.decideCarDoor());

            // Pick a door
            player.setDoorChoice(chooseFirstDoor());

            // Open one of the non-car doors
            doors.decideOpenDoor(player.getDoorChoice());

            // Change doors
            player.setDoorChoice(doors.changeDoorChoice(player.getDoorChoice()));


            // did the player win or lose
            if (player.decideWinOrLose(player.getDoorChoice(), doors.getCarDoor()))
            {
                wins += 1;
            }
        }
        return ((float)wins / iterations) * 100;
    }
}

