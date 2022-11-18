import javax.swing.text.FlowView;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Flat flat = new Flat(new Person[]{
                new Person("Jenish"),
                new Person("Arun"),
                new Person("Nurik")
        });
        System.out.println(flat);
        System.out.println("Person length: "+flat.getPersonLength());
        flat.comService();
        System.out.println("---------------------------------");

        Hostel hostel = new Hostel(new Person[]{
                new Person("Ilim"),
                new Person("Alibek"),
                new Person("Eliza"),
                new Person("Syimyk")
        }
        );
        System.out.println(hostel);
        System.out.println("Person length: "+hostel.getPersonLength());
        hostel.rent();
        System.out.println("---------------------------------");

        Hotel hotel = new Hotel(new Person[]{
                new Person("Baiysh"),
                new Person("Davran"),
                new Person("Kutman")
        });
        System.out.println(hotel);
        System.out.println("Person length: "+hotel.getPersonLength());
        hotel.rent();

    }
}