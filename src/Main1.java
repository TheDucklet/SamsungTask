import java.util.Scanner;




public class Main1 {
    public static void main(String[] args) {
        Game game1 = new Game();
        Unit unit1 = new Unit("Alex");
        Unit unit2 = new Unit("John");

        Game game2 = new Game();
        Wizard wizard1 = new Wizard("Pedro");
        Wizard wizard2 = new Wizard("Medro");
        System.out.println(wizard1);
        System.out.println(wizard2);
        wizard1.attack(wizard2);
        wizard2.attack(wizard1);
        System.out.println(wizard1);
        System.out.println(wizard2);
        //System.out.println(unit1);
        //System.out.println(unit2);
        //unit1.attack(unit2);
        //System.out.println(unit1);
        //System.out.println(unit2);
        //System.out.println(unit2);
        //unit2.attack(unit1);
        //System.out.println(unit1);
        System.out.println(Game.countOfUnits);
        wizard2.print();
        wizard2.print("Game1");
    }
}