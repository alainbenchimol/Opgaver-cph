package task1Torsdagsopgave6;

public class Driver {
    private String name;
    private int age;

    public Driver(String name,int age){
        this.age=age;
        this.name=name;
    }
    @Override
    public String toString(){
        return " is driven by "+name;
    }
}
