public class _04_Quiz {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        System.out.println("커피를 만듭니다.");
        coffeeMaker.fillCoffeeBeans(30);
        coffeeMaker.grindCoffeeBeans();
        coffeeMaker.makeCoffee();
    }
}

class CoffeeMaker {
    int coffeeBeans;

    void fillCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
        System.out.println("원두 채우는 중...");
    }

    boolean grindCoffeeBeans() {
        System.out.println("원두 가는 중...");
        this.coffeeBeans -= 5;
        if (coffeeBeans <= 0) {
            System.out.println("원두가 부족합니다. 원두를 채워주세요.");
            return false;
        }
        return true;
    }

    void preHeat() {
        System.out.println("물을 끓이는 중...");
    }

    void extract() {
        System.out.println("커피 만드는 중...");
    }

    void makeCoffee() {
        if (coffeeBeans <= 0) {
            return;
        }
        this.preHeat();
        this.extract();
        System.out.println("커피가 완료되었습니다.");
    }

}
