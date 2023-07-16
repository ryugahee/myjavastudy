package java0716;

class Rectangle {
    int with, height;

    Rectangle(int with, int height) {
        this.with = with;
        this.height = height;
    }

    int area() {
        int area = with * height;
        return area;
    }

    boolean compare(Rectangle r) {
//        r.area();  s의 면적 15*15
//        this.area();  t.area()

        if (r.area() < this.area()) {
            return true;
        }
        return false;
    }
//    r을 매개변수로 받아온다
//    r의 면적을 구한다
//    t의 면적을 구한다
//    r의 면덕과 t의 면적으 비교한다
//    t의 면적이 클 경우 true 를 반환한다
//    t의 면적이작을경우 false 를 반환한다
}

public class Quiz_11 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(8, 7);
        Rectangle s = new Rectangle(15, 15);
        Rectangle t = new Rectangle(10, 10);

        System.out.println("s의 면적: " + s.area());

        if (t.compare(r)) {
            System.out.println("t는 비교한 값보다 큽니다.");
        } else System.out.println("t는 비교한 값보다 작습니다.");
    }
}
