import java.util.ArrayList;

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

        Cow cow1 = new Cow("Солнышко", 10,1,false,1,true,true);
        cow1.isUdder();
        Wolf wolf1 = new Wolf("Враяна", 2, 4,true,0,false,true);
        wolf1.isFangs();
        Bear bear1 = new Bear("Миша",2,2,false,2,false,true);
        bear1.isSharpСlaws();
    }
}