import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private String phoneNumber;
    private String address;
    private String birthdate;
    private List<Hobby> hobbies;

    public Person(String name, String phoneNumber, String address, String birthdate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.birthdate = birthdate;
        this.hobbies = new ArrayList<>();
    }

    public boolean addHobby(Hobby hobby) {
        Validator validate = new Validator();

        if (!validate.CheckForInt(hobby.getName())){
            return false;
        }
        hobbies.add(hobby);
        return true;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getBirthdate() {
        return birthdate;
    }

    @Override
    public String toString() {
        StringBuilder hobbyList = new StringBuilder();
        for (Hobby hobby : hobbies) {
            hobbyList.append(hobby).append(", ");
        }

        return "Name: " + name + "\nPhone: " + phoneNumber + "\nAddress: " + address + "\nBirthdate: " + birthdate +
                "\nHobbies: " + (hobbies.isEmpty() ? "None" : hobbyList.substring(0, hobbyList.length() - 2)) + "\n";
    }
}


