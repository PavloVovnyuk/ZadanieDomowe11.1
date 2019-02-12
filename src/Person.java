public class Person {
    String firsName;
    String lastName;
    int age;
    double pesel;

    public Person(String firsName, String lastName, int age, double pesel) throws NameUndefinedException, IncorrectAgeException {
        this.firsName = firsName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
        if (firsName == null || firsName.length () < 2) {
            throw new NameUndefinedException ();
        }
        if (lastName == null || lastName.length () < 2) {
            throw new NameUndefinedException ();
        }
        if (age < 1) {
            throw new IncorrectAgeException ();
        }
    }
    @Override
    public String toString() {
        return "Person{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel=" + pesel +
                '}';
    }
}


