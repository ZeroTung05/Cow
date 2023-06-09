public class Cow extends Animal {
    private boolean udder;

    public Cow(String name, int eyes, int legs, boolean tail, int arms, boolean skin, boolean udder) {
        super(name, eyes, legs, tail, arms, skin);
        this.udder = udder;
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
