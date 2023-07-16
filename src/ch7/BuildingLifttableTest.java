package ch7;

interface Lifetable {
  public abstract void liftOff();
  public abstract void move(int x, int y);
  public abstract void stop();
  public abstract void land();
}

class LifetableImpl implements Lifetable {

  @Override
  public void liftOff() {
    System.out.println("속도 개선되었습니다.");
    System.out.println("건물을 띄웁니다.");
  }

  @Override
  public void move(int x, int y) {
    System.out.println("건물을 이동합니다.");
  }

  @Override
  public void stop() {
    System.out.println("건물 이동을 멈춥니다.");
  }

  @Override
  public void land() {
    System.out.println("건물을 착륙합니다.");
  }
}

class Building {}

class Barrack extends Building implements Lifetable {

  LifetableImpl l = new LifetableImpl();
  @Override
  public void liftOff() {
    l.liftOff();
  }

  @Override
  public void move(int x, int y) {
    l.move(x,y);
  }

  @Override
  public void stop() {
    l.stop();
  }

  @Override
  public void land() {
    l.land();
  }
}

class Factory extends Building implements  Lifetable {

  LifetableImpl l = new LifetableImpl();

  @Override
  public void liftOff() {
    l.liftOff();
  }

  @Override
  public void move(int x, int y) {
    l.move(x,y);
  }

  @Override
  public void stop() {
    l.stop();
  }

  @Override
  public void land() {
    l.land();
  }
}


public class BuildingLifttableTest {

  public static void main(String[] args) {
    Barrack b = new Barrack();
    b.liftOff();

    Factory f = new Factory();
    f.liftOff();
  }
}
