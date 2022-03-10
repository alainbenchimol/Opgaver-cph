package task2Torsdagsopgave6;

public class Room {
    private int walls;
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    public Room(int walls,int numberOfDoors,int numberOfLamps,int numberOfWindows){
        this.walls=walls;
        this.numberOfDoors=numberOfDoors;
        this.numberOfLamps=numberOfLamps;
        this.numberOfWindows=numberOfWindows;
    }
    public int getWalls(){
        return this.walls;
    }
    public int getNumberOfDoors(){
        return this.numberOfDoors;
    }
    public int getNumberOfLamps(){
        return this.numberOfLamps;
    }
    public int getNumberOfWindows(){
        return this.numberOfWindows;
    }

}
