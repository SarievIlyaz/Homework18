import java.util.Arrays;

public abstract class Home {
    Person[] family;

    public Home(Person[] family) {
        this.family = family;
    }

    public Person[] getFamily() {
        return family;
    }

    public void setFamily(Person[] family) {
        this.family = family;
    }


    public abstract int getPersonLength();


    @Override
    public String toString() {
        return "Home family: " + Arrays.toString(family);
    }
}
