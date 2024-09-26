import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;

    public Person(String name, String surname, String name1, String surname1) {
        this.name = name1;
        this.surname = surname1;
    }

    public Person(String name, String surname, int age, String name1, String surname1) {
        this.name = name1;
        this.surname = surname1;
    }

    public boolean hasAge() {
        return false;
    }
    public boolean hasAddress() {
        return false;
    }

    public String getName() {
        return "";
    }
    public String getSurname() {
        return "";
    }
    public OptionalInt getAge() {
        return OptionalInt.empty();
    }
    public String getAddress() {
        return "";
    }

    public void setAddress(String address) {  }
    public void happyBirthday() {  }

    public PersonBuilder newChildBuilder() {
        return null;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public int hashCode() {
        return 0;
    }
}