package task1;

public class Dog extends Mammals {

    private boolean knowsCommands;

    public Dog(String type, int age, int pawsNumber, boolean fur, boolean knowsCommands) {
        super(type, age, pawsNumber, fur);
        this.knowsCommands = knowsCommands;
    }

    public boolean isKnowsCommands() {
        return knowsCommands;
    }

    public void setKnowsCommands(boolean knowsCommands) {
        this.knowsCommands = knowsCommands;
    }

    @Override
    public String toString() {
        return "task1.Dog{" +
                "knowsCommands=" + knowsCommands +
                "} " + super.toString();
    }
}
