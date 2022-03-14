package task2Torsdagsopgave6;

public class Building {
    private final int rooms;
    private final int numberOfBathrooms;
    private final int numberOfFloors;
    private final boolean isOfficeBuilding;

    public Building(int rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    private int getRooms() {
        return this.rooms;
    }

    private int getNumberOfBathrooms() {
        return this.numberOfBathrooms;
    }

    private int getNumberOfFloors() {
        return this.numberOfFloors;
    }

    private boolean getIsOfficeBuilding() {
        return this.isOfficeBuilding;
    }

    @Override
    public String toString(){
        return "Rooms: "+rooms+". Number of bathrooms: "+numberOfBathrooms+ ". Number of floors: "+ numberOfFloors + ". Is office building: "+isOfficeBuilding;
    }
    public static void printIsAnOddBuilding(int numberOfFlores,int rooms) {
        if (numberOfFlores > rooms) {
            System.out.println("This is an odd building.");
        } else {
            System.out.println("Is a normal building.");
        }
    }
}

