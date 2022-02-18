package Monty_Hall_Problem;


import java.util.ArrayList;
import java.util.List;

public class Doors {
    // set door variables
    private int carDoor;
    private int openDoor;
    private List<Integer> doorList = new ArrayList<>();

    // constructor
    Doors()
    {
        // add door numbers to door list
        for(int i = 0; i < 3; i++)
        {
            doorList.add(i + 1);
        }
    }


    // decide which door will have the car behind it (randomly choose between door 1,2,3
    // Use (int)(Math.random() * (max - min + 1) + min) to generate a random integer between a minimum and maximum value
    public int decideCarDoor()
    {
        carDoor = (int)(Math.random() * (3 - 1 + 1) + 1);
        return carDoor;
    }

    // if the car door is chosen by the player, randomly pick one of the other two door numbers
    // otherwise show the unchosen goat door
    public int decideOpenDoor(int playerChoice)
    {
        if (playerChoice == carDoor)
        {
            doorList.remove(playerChoice - 1);
            // randomly decide which goat door to open
            // (int)(Math.random() * (max - min + 1) + min)
            openDoor = doorList.get((int)(Math.random() * (1 + 1)));
            // add firstDoorChoice back to list of doors
            doorList.add(playerChoice);


        }
        // If a goat door is chosen, open the other goat door
        else {
            for (int i = 0; i < 3; i++)
            {
                if (doorList.get(i) != playerChoice && doorList.get(i) != carDoor)
                {
                    openDoor = doorList.get(i);
                }
            }
        }
        return openDoor;
    }

    // method to change door choice
    // **** we want the door to change to whichever door isn't currently open or chosen ****
    public int changeDoorChoice(int playerCurrentChoice)
    {
        for (int i = 0; i < 3; i++)
        {
            if (doorList.get(i) != playerCurrentChoice && doorList.get(i) != openDoor)
            {
                return doorList.get(i);
            }
        }
        return -1;
    }

    // getter methods
    public int getCarDoor()
    {
        return this.carDoor;
    }
    public int getOpenDoor()
    {
        return this.openDoor;
    }

    // setter methods
    public void setCarDoor(int carDoorNumber)
    {
        this.carDoor = carDoorNumber;
    }
    public void setOpenDoor(int openDoorNumber)
    {
        this.openDoor = openDoorNumber;
    }
}
