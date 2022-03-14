/*
Task 2: Composition
- 2.a Create a Room.java class with the following fields (use appropriate types):
Walls.java
numberOfDoors
numberOfLamps
numberOfWindows
- 2.b Create a constructor that populates all the fields above.
- 2.c Create getters() for each of the fields above.

- 2.d Create a Building.java class with the following fields (use appropriate types):
Rooms (make sure to use the 'final' keyword here .(Tess: - if you have ever heard about it. The code should work
either way ;).
numberOfBathrooms
numberOfFloors
isOfficeBuilding

- 2.e Create a constructor that populates all the fields above.
- 2.f Create getters() for each of the fields above.
- 2.g In your main method, instantiate at least three different rooms.

-()2.h Add the three rooms to a collection(ArrayList) (preferably of the same data type used for the "Rooms" field in your
Building.java class).

- 2.i In your main method, instantiate a new building.

(-) 2.j print the total number of lamps in the entire building.

()2.k make an if statement that checks if numberOfFloors > number of Rooms. if true, then print "This is an odd
building".
*/
package task2Torsdagsopgave6;
import java.util.ArrayList;
public class Main {
    static ArrayList<Room> rooms = new ArrayList<>();
    static ArrayList<Building> buildings = new ArrayList<>();

    public static void main(String[] args) {
        Room room1 = new Room(4, 1, 1, 1);//2g
        Room room2 = new Room(5, 2, 2, 2);
        Room room3 = new Room(6, 3, 3, 3);
        rooms.add(room1);//2h
        rooms.add(room2);
        rooms.add(room3);

        Building building = new Building(5, 2, 2, false);
        Main.buildings.add(building);

        System.out.println("Total numbers of lamps: " + (room1.getNumberOfLamps() + room2.getNumberOfLamps() + room3.getNumberOfLamps()));
        //System.out.println(rooms);
        System.out.println(building);
        Building.printIsAnOddBuilding(2,3);
    }


}




