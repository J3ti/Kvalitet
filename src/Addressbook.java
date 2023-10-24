import java.util.ArrayList;
import java.util.List;

class AddressBook {
    private List<Person> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    protected List<Person> getContacts() {
        return contacts;
    }

    /**
     * this method sends a list and an objct for verfication wether it can be added or not.
     * depending on the results (1 or 2) it will go to it's designated case.
     * case 1 return false
     * case 2 return true if() validate.CheckforInt and validate.CheckForString passes and then add the person to contact.
     * or false if one of the validates fails.
     *
     * @param person the Object being added to the list
     * @return returns if it got added to the list or not
     */
    public boolean addContact(Person person) {
        Validator validate = new Validator();

        String BName = person.getName();
        String BNumber = person.getPhoneNumber();

        switch (validate.doesUserExist(contacts, person)) {
            case 0:
                return false;

            case 1:
                if (validate.CheckForInt(BName) && validate.CheckForString(BNumber)) {
                    contacts.add(person);
                    return true;
                } else {
                    return false;

                }

        }

        return false;
    }

    /**
     * displayes all the contacts in contacts
     */
    public void displayContacts() {
        for (Person person : contacts) {

            contacts.get(contacts.indexOf(person)).getName();
            System.out.println(person);
        }
    }
}