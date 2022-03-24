package com.alainskoder.SP2Biludlejning;

import java.util.ArrayList;

public class FleetOfCars {

        private ArrayList<Car> fleet=new ArrayList();
        int getTotalRegistrationFeeForFleet(){
            int sum=0;
            for (Car c:fleet) {
                sum+=c.getRegistrationFee();
            }
            return sum;
        }

        public void addCar(Car car){
            fleet.add(car);
        }

        @Override
        public String toString(){
            String result="";
            for (Car c:fleet){
                result+=c.toString();
            }
            return result;
        }

    }

