package com.alainskoder.SP2Biludlejning;
/*
2. Abstrakt klasse ACar. Skal implementere Car interfacet og alle metoderne i dette, undtagen
getRegistrationFee(). Lav klasse attributter til at holde styr på registreringsnummer
(nummerplade), mærke, model og antal døre. (Husk at bruge engelske navne til alt).
Overvej hvilke attributter det giver mening at lave final.
 */
public abstract class ACar implements Car {

    private String registrationNumber;
    private final String carMake;
    private final String carModel;
    private final int numberOfDoors;

    public ACar(String registrationNumber, String carMake, String carModel, int numberOfDoors){
        this.registrationNumber=registrationNumber;
        this.carMake=carMake;
        this.carModel=carModel;
        this.numberOfDoors=numberOfDoors;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public String getMake() {
        return this.carMake;
    }

    public String getModel() {
        return this.carModel;
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    @Override
    public String toString(){
        return " Make: "+carMake+", Model: "+carModel+", Doors: "+numberOfDoors+", Registration No: "
                +registrationNumber;
    }
}
