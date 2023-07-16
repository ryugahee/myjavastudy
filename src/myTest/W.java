package myTest;

public class W {

  public static void main(String[] args) {
    Man a = new Man("브라이언", "칼");
    a.attack();
    a.attack2();
  }
}
  class Man {
	String name;
  String sword;

  Man(String name, String sword) {
    this.name = name;
    this.sword = sword;
  }

  void attack() {
    System.out.printf("%s(이)가 %s(으)로 공격합니다.%n", name, sword);
  }
  void attack2() {
    System.out.printf("%s(이)가 %s(으)로 공격합니다.",  name, sword);
  }
}
