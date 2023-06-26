/*
 * 문제
 * 버스 도착 정보를 출력하는 프로그램을 작성하세요.
 * 각 정보는 적절한 자료형의 변수에 정의합니다.
 *
 * 정보
 * 버스 번호는 "1234", "상암 08"과 같은 형태
 * 남은 시간은 분 단위 (예: 3분, 5분)
 * 남은 거리는 km 단위 (예: 1.5km, 0.8km)
 *
 * 출력
 * 상암 08번 버스
 * 약 3분 후 도착
 * 남은거리 1.2km
 * */

public class _01_Quiz {

  public static void main(String[] args) {
    String busNumber = "상암 08";
    int remainTime = 3;
    double remainDistance = 1.2;

    System.out.printf("%s번 버스\n", busNumber);
    System.out.printf("약 %d분 후 도착\n", remainTime);
    System.out.printf("남은 거리 %.1fkm\n", remainDistance);
  }
}
