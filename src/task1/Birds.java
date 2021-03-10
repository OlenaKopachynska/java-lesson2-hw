package task1;

public class Birds extends Animal{

    public boolean canFly = true;
    public boolean tail;
    public int eyesNum;

    public Birds(String type, int age, boolean canFly, boolean tail, int eyesNum) {
        super(type, age);
        this.canFly = canFly;
        this.tail = tail;
        this.eyesNum = eyesNum;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public int getEyesNum() {
        return eyesNum;
    }

    public void setEyesNum(int eyesNum) {
        this.eyesNum = eyesNum;
    }

    @Override
    public String toString() {
        return "task1.Birds{" +
                "canFly=" + canFly +
                ", tail=" + tail +
                ", eyesNum=" + eyesNum +
                "} " + super.toString();
    }
}
