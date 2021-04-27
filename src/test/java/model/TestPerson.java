package model;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestPerson {
    private Person geoff;
    @BeforeEach
    void setUpTests(){
         geoff = new Person("Mr", "Geoff",
                "Geoffinson","Geoffer",
                "Geoffistan","Geoffy", LocalDate.of(1965,4,21),"Chef",
                new Address("5","Gomble","Dimble","bimble","E6 3RD","England"));

    }


    @Test
    void testSetPersonForenameSuccess(){
      String expected = "Dave";
      geoff.setForename("Dave");
      assert geoff.getForename().equals(expected);

    }
    @Test
    void testSetPersonForenameUnsuccessful() {
        assertThrows(RuntimeException.class, () -> {
            geoff.setForename("D4v3");
        });

    }

}

