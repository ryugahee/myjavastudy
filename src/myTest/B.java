package myTest;

public class B {

  public static void main(String[] args) {
    System.out.println("이름  학번   국어   영어   수학   총점   평균");
    System.out.println("=========================================");



    Aclass student1 = new Aclass("학생1", 1, 100, 100, 100);
    Aclass student2 = new Aclass("학생2", 2, 20, 20, 20);
    Aclass student3 = new Aclass("학생3", 3, 30, 30, 30);
    Aclass student4 = new Aclass("학생4", 4, 40, 40, 40);
    Aclass student5 = new Aclass("학생5", 5, 50, 50, 50);
    int korTot, engTot, mathTot;


   korTot = student1.korscore + student2.korscore+student3.korscore+student4.korscore+student5.korscore;
   engTot = student1.engscore + student2.engscore+student3.engscore+student4.engscore+student5.engscore;
   mathTot = student1.mathscore + student2.mathscore+student3.mathscore+student4.mathscore+student5.mathscore;


    student1.call();
    student2.call();
    student3.call();
    student4.call();
    student5.call();

    System.out.println("=========================================");
    System.out.printf("총점:       %3d %6d %6d", korTot, engTot, mathTot);
  }
}
class Aclass {
  String name;
  int num, korscore, engscore, mathscore, sum;
  float avg;
  int korTot, engTot, mathTot;

  Aclass(String name, int num, int korscore, int engscore, int mathscore) {
    this.name = name;
    this.num = num;
    this.korscore = korscore;
    this.engscore = engscore;
    this.mathscore = mathscore;

    sum = korscore + mathscore + mathscore;
    avg = sum/3;
  }

  void call() {
    System.out.printf("%3s %2d %6d %5d %5d %5d %7.1f %n", name, num, korscore, engscore, mathscore, sum, avg);
  }

}

