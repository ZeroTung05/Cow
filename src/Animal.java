public abstract class Animal {
    private String name;
    private int eyes;
    private int legs;
    private boolean tail;
    private int arms;
    private boolean skin;
    private int healthPoints;
    private int damage = 0;

    public Animal(String name, int eyes, int legs, boolean tail, int arms, boolean skin, int healthPoints, int damage) {
        this.name = name;
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.arms = arms;
        this.skin = skin;
        this.healthPoints = healthPoints;
        this.damage = damage;
    }

    public Animal(String name, int healthPoints, int damage) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.damage = damage;
    }

    public void takeDamage(int damage) {
        int currentHealth = getHealthPoints();
        this.setHealthPoints(currentHealth - damage);
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
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
                "name='" + name + '\'' +
                ", eyes=" + eyes +
                ", legs=" + legs +
                ", tail=" + tail +
                ", arms=" + arms +
                ", skin=" + skin +
                ", healthPoints=" + healthPoints +
                ", damage=" + damage +
                '}';
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}
