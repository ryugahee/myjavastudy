package java0716;

public class Quiz_02 {
    public static void main(String[] args) {

        while (true) {
            int num1 = (int) ((Math.random() * 6) + 1);
            int num2 = (int) ((Math.random() * 6) + 1);

            int plus = num1 + num2;

            System.out.printf("(%d ,%d)%n", num1, num2);

            if (plus == 5) {
                break;
            }
        }
    }
}
