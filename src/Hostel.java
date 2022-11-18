import java.util.Arrays;

public class Hostel extends Home implements Rent{
    public Hostel(Person[] family) {
        super(family);
    }

    @Override
    public int getPersonLength() {
        return getFamily().length;
    }

    @Override
    public void rent() {
        System.out.println( "Arenda toloshot");
    }



}
