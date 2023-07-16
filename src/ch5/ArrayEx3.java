package ch5;

public class ArrayEx3 {
  public static void main(String[] args) {
    int[] arr = new int[5];

    for(int i = 0; i< arr.length; i++){
      arr[i] = i + 1;
    }
    int[] tmp = new int[arr.length * 2];

    for(int i = 0; i < arr.length; i++) {
      tmp[i] = arr[1];
      //arr 배열을 더이상 필요가 없음. 이제부터는 tmp 배열을 사용
      //arr 배열은 현상태로 두면, 메모리누수가 되는 원인이 됨으로
      //c언어처럼 메모리 해제를 직접할 수 없으니, 가비지 컬렉터 대상으로 변경
      arr = tmp;
      System.out.println(tmp);
    }

  }

}
