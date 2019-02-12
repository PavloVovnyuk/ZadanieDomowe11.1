import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        try {
            System.out.println ("Wprowadz imie");
            String firsName = scanner.nextLine ();
            System.out.println ("Wprowadz nazwisko");
            String lastName = scanner.nextLine ();
            System.out.println ("Wprowadz wiek");
            int age = scanner.nextInt ();
            System.out.println ("Wprowadz pesel");
            double pesel = scanner.nextDouble ();
            Person person = new Person (firsName, lastName, age, pesel);
            System.out.println (person.toString ());
        } catch (NameUndefinedException e) {
            System.out.println (e.getMessage ());
        } catch (IncorrectAgeException e) {
            System.out.println (e.getMessage ());
        }
    }
}