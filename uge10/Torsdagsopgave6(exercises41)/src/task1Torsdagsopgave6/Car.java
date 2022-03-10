package task1Torsdagsopgave6;

public class Car {

    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private String driver;

    public Car(String make,String model,int year,String bodyStyle){
        this.make=make;
        this.model=model;
        this.year=year;
        this.bodyStyle=bodyStyle;
    }
    public String getDriver(){
        return this.driver;
    }
    public void setDriver(String newDriver) {
        this.driver = newDriver;
    }
    @Override
    public String toString(){
        return "Make: "+make+". Model: "+model+ " ("+ year + "). BodyStyle: "+bodyStyle;
    }
}
