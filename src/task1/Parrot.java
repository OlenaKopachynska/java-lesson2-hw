package task1;

public class Parrot extends Birds {
    private boolean canTalk;

    public Parrot(String type, int age, boolean canFly, boolean tail, int eyesNum, boolean canTalk) {
        super(type, age, canFly, tail, eyesNum);
        this.canTalk = canTalk;
    }

    public boolean isCanTalk() {
        return canTalk;
    }

    public void setCanTalk(boolean canTalk) {
        this.canTalk = canTalk;
    }

    @Override
    public String toString() {
        return "task1.Parrot{" +
                "canTalk=" + canTalk +
                "} " + super.toString();
    }
}
