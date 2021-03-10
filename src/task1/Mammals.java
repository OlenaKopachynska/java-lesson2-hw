package task1;

public class Mammals extends Animal{

    private int pawsNumber;
    private boolean fur;

    public Mammals(String type, int age, int pawsNumber, boolean fur) {
        super(type, age);
        this.pawsNumber = pawsNumber;
        this.fur = fur;
    }

    @Override
    public String toString() {
        return "task1.Mammals{" +
                "pawsNumber=" + pawsNumber +
                ", fur=" + fur +
                "} " + super.toString();
    }
}
