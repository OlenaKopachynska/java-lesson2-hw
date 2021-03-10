package task1;

public class Horse extends Mammals {

    private String breed;

    public Horse(String type, int age, int pawsNumber, boolean fur, String breed) {
        super(type, age, pawsNumber, fur);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "task1.Horse{" +
                "breed='" + breed + '\'' +
                "} " + super.toString();
    }
}
