package com.alainskoder.SP2Biludlejning;
/*
3. Abstrakt Klasse AFuelCar. Denne klasse skal nedarve fra Acar. Den skal tilføje to metoder:
a. abstract String getFuelType(); // should return “Gasoline” or “Diesel”
b. int kmPrLitre(); // should return how many kilometres the car can drive on 1 litre of fuel
Lav en attribut til at gemme kilometer per liter og initialisér den i konstruktøren.
 */
public abstract class AFuelCar extends ACar{
    private int kmPrLitre;


    public AFuelCar(String registrationNumber,
                    String carMake,
                    String carModel,
                    int numberOfDoors,
                    int kmPrLitre) {
        super(registrationNumber, carMake, carModel, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    public int getKmPrLitre()
    {
        return kmPrLitre;
    }

    // should return “Gasoline” or “Diesel"
    public abstract String getFuelType();

    @Override
    public String toString(){
        return super.toString()+", km pr. litre: "+getKmPrLitre();
    }
}
