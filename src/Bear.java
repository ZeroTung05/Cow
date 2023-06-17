public class Bear extends Animal {
    private boolean SharpСlaws;

    public Bear(String name, int eyes, int legs, boolean tail, int arms, boolean skin, boolean SharpСlaws) {
        super(name, eyes, legs, tail, arms, skin);
        this.SharpСlaws = SharpСlaws;
    }

    public boolean scratching(){
        return true;
    }

    public void isSharpСlaws() {
        if (SharpСlaws) {
            System.out.println("У медведя " + getName() + " есть острые когти!");
        }
        else {
            System.out.println("У медведя " + getName() + " нету острых когтей :(");
        }
    }

    public void setSharpСlaws(boolean SharpСlaws) {
        this.SharpСlaws = SharpСlaws;
    }
}
