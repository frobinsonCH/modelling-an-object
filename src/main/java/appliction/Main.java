package appliction;

import model.Address;
import model.Person;

import java.time.LocalDate;


public class Main {
    public static void main (String[] args){
        Person geoff = new Person("Mr", "Geoff",
                "Geoffinson","Geoffer",
                "Geoffistan","Geoffy", LocalDate.of(1965,4,21),"Chef",
                new Address("5","Gomble","Dimble","bimble","E6 3RD","England"));

        System.out.println(geoff.toString());
    }
}
