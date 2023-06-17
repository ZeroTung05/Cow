import java.util.ArrayList;
import java.util.Random;

public class Main {
    static ArrayList<Cow> cows = new ArrayList<>();
    public static void main(String[] args) {

        /*Cow cow1 = new Cow(10,1,false,1,true,false);
        Cow cow2 = new Cow(2,3,false,1,true,true);
        Cow cow3 = new Cow(2, 4, true, 0, true, true);
        Cow cow4 = new Cow(2, 3, true, 0, true, true);
        Cow cow5 = new Cow(0, 3, false, 0, true, true);
        cows.add(cow1);
        cows.add(cow2);
        cows.add(cow3);
        cows.add(cow4);
        cows.add(cow5);
        for (int i = 0; i < cows.size(); i++) {
            System.out.println(cows.get(i).getEyes());
        }*/

        Cow cow1 = new Cow("Солнышко", 10,1,false,1,true, 100, 0,true);
        cow1.isUdder();
        Wolf wolf1 = new Wolf("Враяна", 2, 4,true,0,false, 50, 30,true);
        wolf1.isFangs();
        Bear bear1 = new Bear("Миша",2,2,false,2,false, 120,20,true);
        bear1.isSharpСlaws();

        System.out.println();

        System.out.println("HP у " + cow1.getName() + " сейчас: " + cow1.getHealthPoints());
        bear1.hit(cow1);
        System.out.println("А теперь HP у " + cow1.getName() + ": " + cow1.getHealthPoints()
                + "\nпосле удара от " + bear1.getName() + " с уроном: " + bear1.getDamage());

        Random random = new Random();
        Bear fighter1;
        Wolf fighter2;

        fighter1 = new Bear("Миша",120,20);
        fighter2 = new Wolf("Враяна",50, 30);

        fighter1.setHealthPoints(random.nextInt(1000) + 1);
        fighter2.setHealthPoints(random.nextInt(1000) + 1);

        fighter1.setDamage(random.nextInt(200) + 1);
        fighter2.setDamage(random.nextInt(200) + 1);

        System.out.println("F1 damage:" + fighter1.getDamage());
        System.out.println("F2 damage:" + fighter2.getDamage());

        while (fighter1.getHealthPoints() > 0 && fighter2.getHealthPoints() > 0) {
            if (random.nextInt(2) == 1) {
                System.out.println("Hit " + fighter1.getClass() + " " + fighter1.getName() + "!");
                fighter1.hit(fighter2);
            } else {
                System.out.println("Hit " + fighter2.getClass() + " " + fighter2.getName() + "!");
                fighter2.hit(fighter1);
            }
            System.out.println("Fighter1 HP: " + fighter1.getHealthPoints() +
                    "\nFighter2 HP: " + fighter2.getHealthPoints() + "\n");
        }

        if (fighter1.getHealthPoints() <= 0) {
            System.out.println("Победил " + fighter2.getName() + "!");
        } else {
            System.out.println("Победил " + fighter1.getName() + "!");
        }
    }
}