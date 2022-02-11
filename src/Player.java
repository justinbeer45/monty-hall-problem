public class Player {
    // player property declarations
    private int door;
    private boolean changeDoor;

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
