public class Wolf extends Animal {
    private boolean fangs;

    public Wolf(String name, int eyes, int legs, boolean tail, int arms, boolean skin, boolean fangs) {
        super(name, eyes, legs, tail, arms, skin);
        this.fangs = fangs;
    }

    public boolean bites(){
        return true;
    }

    public void isFangs() {
        if (fangs) {
            System.out.println("У волка " + getName() + " есть клыки!");
        }
        else {
            System.out.println("У волка " + getName() + " нет клыков :(");
        }
    }

    public void setFangs(boolean fangs) {
        this.fangs = fangs;
    }
}
