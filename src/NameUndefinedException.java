public class NameUndefinedException extends Exception {
    public NameUndefinedException() {
        super ("Imie lub nazwisko jest null lub skladasię mniej od 2 liter , wprowadz dane ponownie");
    }
}