package myTest;

public class Ex {
  public static void main(String[] args) {
    CoffeeMaker2 coffeeMaker = new CoffeeMaker2(6);
    coffeeMaker.order();
    coffeeMaker.fillCoffeeBeans(30);
    coffeeMaker.grindCoffeeBeans();
    coffeeMaker.makeCoffee();
    coffeeMaker.serve();
    System.out.println("======================");

    MilkCoffeeMaker milkCoffeeMaker = new MilkCoffeeMaker(6);

    System.out.println("======================");

    SugerCoffeeMaker sugarCoffeeMaker = new SugerCoffeeMaker(6);

  }
}
class CoffeeMaker2 {
  private static final int COFFEEBEANS_PER_COFFEE = 5;
  private int coffeeBeans;
  int shots;

  CoffeeMaker2(int shots) {
    this.shots = shots;
  }

  void order() {
    System.out.println("커피를 만듭니다.");
  }
  void fillCoffeeBeans(int coffeeBeans) {
    this.coffeeBeans = coffeeBeans;
    System.out.println("원두 채우는 중...");
  }

  void grindCoffeeBeans() {
    System.out.println("원두 가는 중...");
    this.coffeeBeans -= COFFEEBEANS_PER_COFFEE;

    if (coffeeBeans > 0) {
      return;
    }
    System.out.println("원두가 부족합니다. 원두를 채워주세요.");
  }
  private void preHeat() {
    System.out.println("물을 끓이는 중...");
  }

  private void extract() {
    System.out.println("커피 만드는 중...");
  }

  void makeCoffee() {
    if (coffeeBeans <= 0) {
      return;
    }
    this.preHeat();
    this.extract();
  }
  void serve() {
    System.out.printf("커피(%d샷) 준비가 완료되었습니다. \n", this.shots);
  }
}

class MilkCoffeeMaker extends CoffeeMaker2 {
  MilkCoffeeMaker(int shots) {
    super(shots);
  }
  @Override
  void order() {
    System.out.println("밀크 커피를 만듭니다.");
  }

  private void addMilk() {
    System.out.println("우유 넣는 중...");
  }

  @Override
  void makeCoffee() {
    super.makeCoffee();
    addMilk();
  }

  @Override
  void serve() {
    System.out.printf("밀크 커피(%d샷) 준비가 완료되었습니다. \n", this.shots);
  }
}

class SugerCoffeeMaker extends CoffeeMaker2 {
  SugerCoffeeMaker(int shots) {
    super(shots);
  }

  @Override
  void order() {
    System.out.println("설탕 커피를 만듭니다.");
  }

  void addSuger() {
    System.out.println("설탕 넣는 중...");
  }
  @Override
  void makeCoffee() {
    super.makeCoffee();
    addSuger();
  }
  @Override
  void serve() {
    System.out.printf("설탕 커피(%d샷) 준비가 완료되었습니다. \n", this.shots);
  }


}
