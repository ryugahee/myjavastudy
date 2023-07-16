package myTest;

class Game1 {
  String name, weapon;

  Game1(String name, String weapon) {
    this.name = name;
    this.weapon = weapon;
  }

  void attack() {
    System.out.printf("%s(이)가 %s(으)로 공격합니다.%n", name, weapon);
  }
}

class Game2 extends Game1 {
  Game2(String name, String weapon) {
    super(name, weapon);
  }
}


class A {
  public static void main(String[] args) {
    Game1 game1 = new Game1("홍길동", "활");
    game1.attack();
    System.out.println();
    Game2 game2 = new Game2("홍길순", "칼");
    game2.attack();
    System.out.println();
    Game2 game3 = new Game2("홍길순", "창");
    game3.attack();

  }
}
