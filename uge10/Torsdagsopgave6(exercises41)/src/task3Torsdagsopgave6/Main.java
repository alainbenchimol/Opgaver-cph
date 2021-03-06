/*
##Task 3: (sorry, switching language now) ArrayList og Objekter
- 3.a Lav en klasse, Customer, med attributterne: String firstName String lastName String username int id
- 3.b Klassen skal have en konstruktor der tager et parameter med kundens navn og brugernavn. Giv klassen en toString()
metode, der printer kundens detaljer pænt ud. Gør alle klassens felter private, og tilføj getters().
- 3.c Skriv en Main klasse med en main metode, hvor der oprettes en beholder af typen ArrayList, som du kalder
'customers'. Denne skal være erklæret som static global variabel - dvs tilgængelig udenfor main metoden.
I customers skal du placere 6 instanser af Customer typen. (Du kan oprette instanserne først, og så add'e dem til
array'et. Du kan også adde og instantiere i samme linie.)
-3.d Skriv en metode i Main kaldet printCustomers(), hvor du printer alle kunderne ud ved at gennemløbe 'customers'
med et ’for each’ loop. Test metoden fra main ved at kalde den.

Brug eventuel overskydende tid til at færdiggøre dokumentation af Matadorprojektet så det helt afspejler koden som
den ser ud lige nu. Herefter henviser vi til træningsøvelser under "Ekstra materiale" inde på Moodle.
 */
package task3Torsdagsopgave6;
import java.util.ArrayList;

public class Main {
    static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        Customer customer1=new Customer("Alain", "Benchimol","ab",1);
        Customer customer2=new Customer("Anne-Mette", "Benchimol","amb",2);
        Customer customer3=new Customer("Phillip", "Benchimol","pb",3);
        Customer customer4=new Customer("Simon", "Benchimol","sb",4);
        Customer customer5=new Customer("Benjamin", "Benchimol","bb",5);
        Customer customer6=new Customer("Jacob", "Benchimol","jb",6);

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);

        printCustomers(customers);

    }

    private static void printCustomers(ArrayList<Customer> customers) {
        for(Customer s:customers){
            System.out.println(s);
        }
    }

}
