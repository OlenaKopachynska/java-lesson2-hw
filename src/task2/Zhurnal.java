package task2;

public class Zhurnal extends Kniga {

    public Zhurnal(String material, int width, int height, int pageNumber) {
        super(material, width, height, pageNumber);
    }

    @Override
    public String toString() {
        return "Zhurnal{} " + super.toString();
    }
}
