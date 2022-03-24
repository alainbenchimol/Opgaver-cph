package com.alainskoder.SP2Biludlejning;
/*
5. Klasse DieselCar. Denne klasse nedarver også fra FuelCar og skal også implementere de to
abstrakte metoder getFuelType() og getRegistrationFee(). Herudover skal der være en
metode, hasParticleFilter(), der fortæller om bilen har et partikelfilter monteret.
Registreringsafgiften skal beregnes ud fra beskrivelsen i toppen af opgaven.
 */
public class DieselCar extends AFuelCar{

    private boolean particleFilter;

    public DieselCar(String registrationNumber,
                     String carMake,
                     String carModel,
                     int numberOfDoors,
                     int kmPrLitre,
                     boolean particleFilter) {
        super(registrationNumber, carMake, carModel, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    /*
    3. For en Dieselbil er der samme afgift som for benzinbilen, plus en udligningsafgift, som også
    er afhængig af km/l. Hvis bilen kører mellem 20 km/l og 50 km/l er udligningsafgiften 130
    kr, kører den mellem 15 km/l og 20 km/l er den 1390 kr, kører den mellem 10 km/l og 15
    km/l er den 1850 kr, kører den mellem 5 km/l og 10 km/l er den 2770 kr, og kører den
    under 5 km/l er den 15260 kr. Der er desuden en partikeludledningsafgift på 1000 kr hvis
    bilen ikke har et partikelfilter monteret.
     */

    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        int sum=0;
        int kmpl = getKmPrLitre();
        if(20 <= kmpl && 50 > kmpl){
            sum= 330+130;
        }if(15<=kmpl&&20>kmpl){
            sum= 1050+1390;
        }if(10<=kmpl&&15>kmpl){
            sum= 2340+1850;
        }if(5<=kmpl&&10>kmpl){
            sum= 5500+2770;
        }if(5>kmpl) {
            sum = 10470 + 15260;
        }if(particleFilter){
            return sum;
        }else {
            return sum + 1000;
        }
    }
    @Override
    public String toString(){return super.toString()+", Fuel type: "+getFuelType()+", Particle Filter: "+particleFilter;}
}
