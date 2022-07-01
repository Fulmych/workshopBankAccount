package se.lexicon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bankAccountDAOTest {
    bankAccount b = new bankAccount();
    customer a = new customer();
    @Test
    void addAccount() {
        a.setFirstName("Bamse");
        a.setLastname("Långhus");
        b.setId("165146");
        b.setBalance(2);
        b.setA(a);
        Assertions.assertAll("b",
                () -> assertEquals("165146", b.getId()),
                () -> assertEquals(2, b.getBalance()),
                () -> assertEquals(a, b.getA()));
    }

    @Test
    void findAccount() {
        a.setFirstName("Bamse");
        a.setLastname("Långhus");
        b.setId("165146");
        Assertions.assertEquals("Bamse Lånhus Id: 165146", "Bamse Lånhus Id: 165146");
    }
}