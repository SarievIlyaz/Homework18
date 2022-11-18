public class Hotel extends Home implements Rent {
    public Hotel(Person[] family) {
        super(family);
    }

    @Override
    public int getPersonLength() {
       return  getFamily().length;
    }

    @Override
    public void rent() {
        System.out.println("Arenda toloshot");
    }
}
