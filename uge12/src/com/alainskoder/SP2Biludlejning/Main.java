package com.alainskoder.SP2Biludlejning;

public class Main {

    public static void main(String[] args) {

        FleetOfCars myFleet=new FleetOfCars();

        Car car1=new DieselCar("OX42420","Opel","Kadet",5,15,false);
        myFleet.addCar(car1);

        Car car2=new DieselCar("OX42421","Opel","Kadet",5,21,true);
        myFleet.addCar(car2);

        Car car3=new ElectricCar("OX42422","Opel","Corsa-e",5,50,330);
        myFleet.addCar(car3);

        Car car5=new ElectricCar("OY42423","Renault","Zoe",5,52,343);
        myFleet.addCar(car5);

        Car car4=new GasolinCar("OY42424","BMW","530i",5,9);
        myFleet.addCar(car4);

        Car car6=new GasolinCar("OY42425","BMW","218i",3,21);
        myFleet.addCar(car6);

        System.out.println("Reg.fee: "+car1.getRegistrationFee()+" kr."+" ->"+car1);
        System.out.println("Reg.fee: "+car2.getRegistrationFee()+" kr."+" ->"+car2);
        System.out.println("Reg.fee: "+car3.getRegistrationFee()+" kr."+" ->"+car3);
        System.out.println("Reg.fee: "+car5.getRegistrationFee()+" kr."+" ->"+car5);
        System.out.println("Reg.fee: "+car4.getRegistrationFee()+" kr."+" ->"+car4);
        System.out.println("Reg.fee: "+car6.getRegistrationFee()+" kr."+" ->"+car6);

        System.out.println("Total reg.fee for fleet: "+myFleet.getTotalRegistrationFeeForFleet()+" kr.");
    }
}
