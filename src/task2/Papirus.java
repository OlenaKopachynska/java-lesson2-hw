package task2;

public class Papirus {

    private String material;
    private int width;
    private int height;

    public Papirus() {
    }

    public Papirus(String material, int width, int height) {
        this.material = material;
        this.width = width;
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Papirus{" +
                "material='" + material + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
