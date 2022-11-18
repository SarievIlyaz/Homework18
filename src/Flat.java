public class Flat extends Home implements ComService{
    public Flat(Person[] family) {
        super(family);
    }

    @Override
    public int getPersonLength() {
        return getFamily().length;
    }

    @Override
    public void comService() {
        System.out.println("Kom.usluga toloshot");
    }
}
