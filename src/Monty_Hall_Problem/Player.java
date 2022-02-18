package Monty_Hall_Problem;

public class Player {
    // player property declarations
    private int door;
    private boolean changeDoor;
    private boolean playerWin;

    // constructor
    Player()
    {
    }

    // decide if the player wants to change their door
    public boolean decideDoorChange(int playerInput)
    {
        if (playerInput == 1)
        {
            changeDoor = true;
        }
        else
        {
            changeDoor = false;
        }
        return changeDoor;
    }



    // decide if the player wins the car
    public boolean decideWinOrLose(int playerDoor, int carDoor)
    {
        if (playerDoor == carDoor)
        {
            playerWin = true;
        }
        else
        {
            playerWin = false;
        }
        return playerWin;
    }

    // getter for player properties
    public int getDoorChoice()
    {
        return this.door;
    }
    public boolean getChangeDoorChoice(){
        return this.changeDoor;
    }

    // setter for player properties
    public void setDoorChoice(int doorNumber)
    {
        this.door = doorNumber;
    }
    public void setChangeDoorChoice(boolean decisionToChange){
        this.changeDoor = decisionToChange;
    }
}
