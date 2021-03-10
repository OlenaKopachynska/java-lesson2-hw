package task3;

public class Woman implements WomanClothes {

    private int age;
    private String name;

    public Woman(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean wearWoman() {
        return false;
    }
}
