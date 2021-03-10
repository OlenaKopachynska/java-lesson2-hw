package task1;

public class Flamingo extends Birds {
    private String color = "pink";

    public Flamingo(String type, int age, boolean canFly, boolean tail, int eyesNum, String color) {
        super(type, age, canFly, tail, eyesNum);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "task1.Flamingo{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
