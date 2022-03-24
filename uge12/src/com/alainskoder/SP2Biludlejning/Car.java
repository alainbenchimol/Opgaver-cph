package com.alainskoder.SP2Biludlejning;
/*
1. Interface Car. Skal have følgende metoder:
a. String getRegistrationNumber(); //The number on the number plate
b. String getMake(); // The make of the car e.g. Audi
c. String getModel(); // The model of the car e.g. A6
d. Int getNumberOfDoors(); // The number of doors
e. Int getRegistrationFee(); // Calculates the registration fee for the car
 */
public interface Car {
    //The number on the number plate
    String getRegistrationNumber();
    // The make of the car e.g. Audi
    String getMake();
    // The model of the car e.g. A6
    String getModel();
    // The number of doors
    int getNumberOfDoors();
    // Calculates the registration fee for the car
    int getRegistrationFee();

}
