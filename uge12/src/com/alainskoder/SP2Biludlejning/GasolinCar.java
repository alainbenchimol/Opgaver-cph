package com.alainskoder.SP2Biludlejning;
/*
4. Klasse GasolineCar. Denne klasse nedarver fra FuelCar og skal implementere de to
abstrakte metoder getFuelType() og getRegistrationFee(). Registreringsafgiften skal
beregnes ud fra beskrivelsen i toppen af opgaven.
 */
public class GasolinCar extends AFuelCar{

    public GasolinCar(String registrationNumber,
                      String carMake,
                      String carModel,
                      int numberOfDoors,
                      int kmPrLitre) {
        super(registrationNumber, carMake, carModel, numberOfDoors, kmPrLitre);
    }

    public String getFuelType() {
        return "Gasoline";
    }
    /*
    1. For en Benzinbil er afgiften afhængig af kilometer pr liter. Hvis den kører mellem 20 km/l
og 50 km/l er prisen 330 kr, mellem 15 km/l og 20 km/l er prisen 1050 kr, mellem 10 km/l
og 15 km/l er prisen 2340 kr, mellem 5 km/l og 10 km/l er prisen 5500kr, og under 5 km/l
er prisen 10470 kr.
     */
    public int getRegistrationFee() {
        int kmpl = getKmPrLitre();
        if (20 <= kmpl) {
            return 330;
        }
        if (15 <= kmpl && 20 > kmpl) {
            return 1050;
        }
        if (10 <= kmpl && 15 > kmpl) {
            return 2340;
        }
        if (5 <= kmpl && 10 > kmpl) {
            return 5500;
        }
            return 10470;
    }
    @Override
    public String toString(){
        return super.toString()+", Fuel type: "+getFuelType();
    }
}



