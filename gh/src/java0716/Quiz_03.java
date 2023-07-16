package java0716;

public class Quiz_03 {
    public static void main(String[] args) {

        for (int x = 0; x <= 15; x++) {
            for (int y = 0; y <= 15; y++) {
                int result = 4 * x + 5 * y;
                if (result == 60) {
                    System.out.printf("(%d ,%d)%n", x, y);
                }
            }
        }
    }
}
