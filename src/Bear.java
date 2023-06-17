public class Bear extends Animal implements Fightable {
    private boolean sharpСlaws;

    public Bear(String name, int eyes, int legs, boolean tail, int arms, boolean skin, int healthPoints, int damage, boolean sharpСlaws) {
        super(name, eyes, legs, tail, arms, skin, healthPoints, damage);
        this.sharpСlaws = sharpСlaws;
    }

    public Bear(String name, int healthPoints, int damage) {
        super(name, healthPoints, damage);
    }

    public boolean scratching(){
        return true;
    }

    public void isSharpСlaws() {
        if (sharpСlaws) {
            System.out.println("У медведя " + getName() + " есть острые когти!");
        }
        else {
            System.out.println("У медведя " + getName() + " нету острых когтей :(");
        }
    }

    public void setSharpСlaws(boolean sharpСlaws) {
        this.sharpСlaws = sharpСlaws;
    }

    @Override
    public void hit(Animal animal) {
        animal.takeDamage(getDamage());
    }
}
