public class Wolf extends Animal implements Fightable {
    private boolean fangs;


    public Wolf(String name, int eyes, int legs, boolean tail, int arms, boolean skin, int healthPoints, int damage, boolean fangs) {
        super(name, eyes, legs, tail, arms, skin, healthPoints, damage);
        this.fangs = fangs;
    }

    public Wolf(String name, int healthPoints, int damage) {
        super(name, healthPoints, damage);
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

    @Override
    public void hit(Animal animal) {
        animal.takeDamage(getDamage());
    }
}
