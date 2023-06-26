/*
 * 문제
 * 어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는
 * 프로그램을 작성하시오.
 *
 * 조건
 * 키가 120cm 이상인 경우에만 탑승 가능
 * 삼항 연산자를 사용할 것
 *
 * 출력
 * 키가 119 이므로 탑승 불가능합니다.
 * 키가 130 이므로 탑승 가능합니다.
 * */

public class _02_Quiz {

  public static void main(String[] args) {
    int height = 130;
    String result = height >= 120 ? "가능합니다." : "불가능합니다.";

    System.out.printf("키가 %d 이므로 탑승 %s", height, result);
  }
}
