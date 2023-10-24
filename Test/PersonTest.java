import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private AddressBook testBook;
    protected Hobby basket;
    protected Hobby football;
    protected Hobby handboll;
    protected Hobby volleyboll;
    protected Person testPerson_1;


    /**
     * setUp data for coming tests
     */
    @BeforeEach
    void setUp() {
        testBook = new AddressBook();
        testPerson_1 = new Person("Alice", "1234567890", "Rosenvägen 36B", "1998-04-23");
        basket = new Hobby("Basket");
        football = new Hobby("Fotboll");
        handboll = new Hobby("Handboll");
        volleyboll = new Hobby("fdsaf");
        testPerson_1.addHobby(football);
        testPerson_1.addHobby(handboll);
        testPerson_1.addHobby(basket);
    }

    /**
     * Here we try to add a hobby to the Person object
     */
    @Test
    void addHobby() {
        assertTrue(testPerson_1.addHobby(volleyboll));
    }

    /**
     * Here we test if the println is printing out correctly
     */
    @Test
    void testToString() {
        assertNotNull(testPerson_1, testBook.toString());
    }


    /**
     * A test to see if the contact(testPerson_1) have 4 hobbies as it is added in the setUp()
     * method.
     * The test should be True
     */
    @Test
    void totalAmountOfHobbies(){
        assertEquals(4,testPerson_1.getHobbies().size());

    }

}