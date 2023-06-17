public class Cow extends Animal {
    private boolean udder;

    public Cow(String name, int eyes, int legs, boolean tail, int arms, boolean skin, int healthPoints, int damage, boolean udder) {
        super(name, eyes, legs, tail, arms, skin, healthPoints, damage);
        this.udder = udder;
    }

    public Cow(String name, int healthPoints, int damage) {
        super(name, healthPoints, damage);
    }

    public boolean milking(){
        return true;
    }

    public void isUdder() {
        if (udder) {
            System.out.println("У коровы " + getName() + " есть вымя!");
        }
        else {
            System.out.println("У коровы " + getName() + " нет вымени :(");
        }
    }

    public void setUdder(boolean udder) {
        this.udder = udder;
    }
}
