package com.alainskoder.SP2Biludlejning;
/*
6. Klasse ElectricCar. Denne klasse nedarver fra ACar. Den skal tilføje metoderne:
a. getBatteryCapacityKWh(); // returns the battery capacity in kilowatt hours
b. getMaxRangeKm(); // returns the maximum range in kilometres.
c. getWhPrKm(); // returns the power consumption in watt hours per driven kilometre.
Lav attributer til battery capacity og max range, som initialiseres i konstruktøren. Beregn
watt-timer per kilometer ud fra disse to attributter.
 */

/*
2. For en Elbil gælder de samme regler som for en benzinbil, blot skal man først omregne
watt-timer pr kilometer til km/l. Det gøres ved at dividere Wh/km med 91,25 og dernæst
dividere 100 med dette tal. Se evt. formlen her: https://fdm.dk/alt-om-biler/dinerettigheder/
boder-afgifter/ejerafgift-elbil.
 */
public class ElectricCar extends ACar{
    double batteryCapacityKWh;
    double maxRangeKm;
    double whPrKm;

    public ElectricCar(String registrationNumber,
                       String carMake,
                       String carModel,
                       int numberOfDoors,
                       int batteryCapacityKWh,
                       int maxRangeKm) {
        super(registrationNumber, carMake, carModel, numberOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxRangeKm = maxRangeKm;

    }

    // returns the battery capacity in kilowatt hours
    public double getBatteryCapacityKWh(){
        return this.batteryCapacityKWh;
    }
    // returns the maximum range in kilometres.
    public double getMaxRangeKm(){
        return this.maxRangeKm;
    }
    // returns the power consumption in watt hours per driven kilometre.
    public double getWhPrKm(){
        whPrKm=batteryCapacityKWh*1000/maxRangeKm;
        return whPrKm;

    }
    @Override
    public int getRegistrationFee(){
        double a=batteryCapacityKWh*1000/maxRangeKm;
        double b=a/91.25;
        double res=100/b;

        if (20 <= res) {
            return 330;
        }
        if (15 <= res && 20 > res) {
            return 1050;
        }
        if (10 <= res && 15 > res) {
            return 2340;
        }
        if (5 <= res && 10 > res) {
            return 5500;
        }else {
            return 10470;
        }
    }
    @Override
    public String toString(){
        return super.toString()+", Battery Capacity KWh: "+getBatteryCapacityKWh()+", Max Range km: "+getMaxRangeKm()+", Wh/km: "+getWhPrKm();
    }
}
