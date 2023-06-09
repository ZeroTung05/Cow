public class Animal {
    private String name;
    private int eyes;
    private int legs;
    private boolean tail;
    private int arms;
    private boolean skin;

    public Animal(String name, int eyes, int legs, boolean tail, int arms, boolean skin) {
        this.name = name;
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.arms = arms;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Animal{" +
                "eyes=" + eyes +
                ", legs=" + legs +
                ", tail=" + tail +
                ", arms=" + arms +
                ", skin=" + skin +
                '}';
    }
}
