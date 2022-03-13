package task3Torsdagsopgave6;

public class Customer {
    String firstName;
    String lastName;
    String username;
    int id;

    Customer(String firstName, String lastName, String username, int id){
        this.firstName=firstName;
        this.lastName=lastName;
        this.username=username;
        this.id=id;
    }
    private String getFirstName(){
        return this.firstName;
    }
    private String getLastName(){
        return this.lastName;
    }
    private String getUsername(){
        return this.username;
    }
    private int getId(){
        return this.id;
    }
    @Override
    public String toString(){
        return "First name: "+firstName+". Last name: "+lastName+ ". Username: "+ username + ". Id: "+id;
    }
}
