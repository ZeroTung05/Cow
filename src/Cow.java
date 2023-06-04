public class Cow {
    private int eyes;
    private int legs;
    private boolean tail;
    private int arms;
    private boolean skin;
    private boolean udder;

    public Cow(int eyes, int legs, boolean tail, int arms, boolean skin, boolean udder) {
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.arms = arms;
        this.skin = skin;
        this.udder = udder;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public int getArms() {
        return arms;
    }

    public void setArms(int arms) {
        this.arms = arms;
    }

    public boolean isSkin() {
        return skin;
    }

    public void setSkin(boolean skin) {
        this.skin = skin;
    }

    public boolean isUdder() {
        return udder;
    }

    public void setUdder(boolean udder) {
        this.udder = udder;
    }
}
