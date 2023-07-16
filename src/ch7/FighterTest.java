package ch7;

interface Movable { void move(int x, int y);}
interface Attackable { void attack(Unit u);}
interface Fightable extends Movable, Attackable {}

class Unit {
  int currentHP;
  int x;
  int y;
}

class Fighter extends Unit implements Fightable {
  public void move(int x, int y) {}
  public void attack(Unit u) {}
}

public class FighterTest {

  public static void main(String[] args) {
    Fighter f = new Fighter();
    if (f instanceof Unit) {
      System.out.println("f는 Unit의 자식임.");
    }
    if (f instanceof Fighter) {
      System.out.println("f는 Fightable을 구현. -> Fightable type임.");
    }
    if (f instanceof Movable) {
      System.out.println("f는 Movable을 구현.");
    }
    if (f instanceof Attackable) {
      System.out.println("f는 Attackable을 구현.");
    }
    if (f instanceof Object) {
      System.out.println("f는 Object의 자식임.");
    }

  }

}
