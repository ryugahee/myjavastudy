package ch7;

interface InterF {
  public abstract void jdbc();
}
class WebApp {
  void getJDBC() {
    InterF i = InterfaceManager.getInstance();
    i.jdbc();
  }
}

class Oracle implements InterF {
  @Override
  public void jdbc() {
    System.out.println("Oracle jdbc 임.");
  }
}

class InterfaceManager {
  public static InterF getInstance() {
    return new Oracle();
  }
}

public class InterfaceTest3 {

  public static void main(String[] args) {
    WebApp wa = new WebApp();
    wa.getJDBC();
  }

}
