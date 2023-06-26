/*
 * 문제
 * 2단부터 9단까지의 구구단을 출력하는 프로그램을 작성하세요.
 *
 * 출력
 * 2 x 1 = 2
 * 2 x 2 = 4
 * 2 x 3 = 6
 */

public class _03_Quiz {

  public static void main(String[] args) {
    for (int i=2; i<10; i++) {
      for (int j = 1; j < 10; j++) {
        System.out.printf("%d x %d = %d\n", i, j, i * j);
      }
    }
  }
}
