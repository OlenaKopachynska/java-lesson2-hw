package task2;

public class Komics extends Kniga {

    public Komics(String material, int width, int height, int pageNumber) {
        super(material, width, height, pageNumber);
    }

    @Override
    public String toString() {
        return "Komics{} " + super.toString();
    }
}
