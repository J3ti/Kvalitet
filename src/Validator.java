import java.util.List;

public class Validator {
    /**
     * a loop to find a string returns if it has found one or not.
     * @param string we take in a string to check if it has a number in it.
     * @return returns weather an int is found or not
     */
    public Boolean CheckForInt(String string) {
        for (char c : string.toCharArray()) {
            if (Character.isDigit(c)) {
                System.out.println(string + "Is not correct");
                return false;
            }
        }
        return true;
    }

    /**
     * Checks after letters in a phone number
     * @param string The phoneNumber in question
     * @return returns true or false
     */
    public boolean CheckForString(String string) {
        for (char c : string.toCharArray()) {
            if (!Character.isDigit(c)) {
                System.out.println(string + "Is not correct");
                return false;
            }
        }
        return true;
    }

    /**
     * Checks in a list if the person already exists in contacts
     * @param contacts the list with the object type Person
     * @param person the object being compared to the contents of the list
     * @return returns 1 if it finds a match returns 2 if it finds no matches.
     */
    public int doesUserExist(List<Person> contacts, Person person) {

        for (Person pers : contacts) {
            if (person.getName().equals(pers.getName()) && person.getPhoneNumber().equals(pers.getPhoneNumber()) && person.getAddress().equals(pers.getAddress()) && person.getAddress().equals(pers.getAddress())) {
                return 0;
            }
        }
        return 1;
    }

}


