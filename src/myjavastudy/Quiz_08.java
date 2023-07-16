package myjavastudy;

public class Quiz_08 {

  public static void main(String[] args) {
    int[] array = {1, 5, 3, 8, 2};

    int max = array[0];

    for (int i = 0; i <= array.length; i++) {
      if (i > array[0]) {
        max = i;
      } else {
        return;
      }
    }
    System.out.println("최대값은 " + max + "입니다.");
  }
}
