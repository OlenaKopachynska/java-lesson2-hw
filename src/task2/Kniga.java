package task2;

public class Kniga extends Papirus {

    private int pageNumber;

    public Kniga(String material, int width, int height, int pageNumber) {
        super(material, width, height);
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return "Kniga{" +
                "pageNumber=" + pageNumber +
                "} " + super.toString();
    }
}
