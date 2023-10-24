import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * This class is to provide stable tests for AddressBook.Java
 */
class AddressBookTest {
    public AddressBook testBook;
    protected Person testPerson_1;
    protected Person testPerson_2;
    protected Person testPerson_3;
    protected Person testPerson_4;


    /**
     * setUp data for coming tests
     */
    @BeforeEach
    void setUp() {
        testBook = new AddressBook();
        testPerson_1 = new Person("Alice", "1234567890", "Rosenvägen 36B", "1998-04-23");
        testBook.addContact(testPerson_1);
        testPerson_2 = new Person("Karl", "4731894763", "Karl-Johans väg 3A", "1993-02-02");
        testBook.addContact(testPerson_2);
        testPerson_3 = new Person("Clara", "381397644", "Rosenvägen 82A", "1995-12-12");
        testBook.addContact(testPerson_3);
        testPerson_4 = new Person("Jesper", "432189075", "Rosenvägen 82A", "1995-05-24");
    }

    /**
     * Here is a test that test the possibility to add a contact.
     * should not be able to add two of the same contacts: Test schould be Negative.
     * (Includes testfallCase TC04)
     */
    @Test
    void addContact() {
        assertTrue(testBook.addContact(testPerson_4), "Test did not pass (addContact) ");
    }
    @Test
    void sameContact(){

    }

    /**
     * Here we try to display all contacts from
     */
    @Test
    void displayContacts() {
        testBook.displayContacts();
    }

    /**
     * Here is a test that is testing the wrong inputs for name.
     * Results should be Negative
     * (Includes testfallCase TC01)
     */
    @Test
    void wrongContactNameWritten() {
        Person wrongName = new Person("Alice24#", "0730771293", "Malmovägen 3B", "1994-04-23");
        assertFalse(testBook.addContact(wrongName), "Test passed");
    }

    /**
     * Here is a test that is testing the wrong inputs of for phone number.
     * Results should be Negative
     * (Includes testfallCase TC02)
     */
    @Test
    void wrongContactNumberWritten() {
        Person wrongNumber = new Person("Alice", "2774HUIFUI&#", "Malmovägen 3B", "194-04-23");
        assertFalse(testBook.addContact(wrongNumber), "Test did not pass (WrongContactNumberWritten)");
    }

    /**
     * A test to see if you can add a person with the exact same information.
     * Results should be negative
     */
    @Test
    void addContactFalseTwin() {
        Person testTwin = new Person("Alice", "1234567890", "Rosenvägen 36B", "1998-04-23");
        testBook.addContact(testTwin);
        assertNotSame(testTwin,testPerson_1,"Dem ska vara olika");
    }

    /**
     * A test to see if the contacts have 3 contacts as it is added in the setUp()
     * method.
     * The test should be True
     */
    @Test
    void totalAmountOfContacts(){
        assertEquals(3,testBook.getContacts().size());

    }

    /**
     * A test to see if the list is null meaning nothing in it.
     * in case of the totalAmountOfContactsFail then we can safely assure if
     * it is because the list being null or an arithmetic error.
     * The test should be True.
     */
    @Test
    void isItNullContacts(){
        assertNotNull(testBook.getContacts());
    }

}
