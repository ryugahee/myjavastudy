package java0716;

import java.util.Scanner;

class Grade {
    int network;
    int linux;
    int git;

    Grade(int network, int linux, int git) {
        this.network = network;
        this.linux = linux;
        this.git = git;
    }

    int average() {
        int sum = network + linux + git;
        int average = sum / 3;
        return average;
    }

}

public class Quiz_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("네트워크, 리눅스, 깃 순으로 3개의 정수 입력 >>");
        int network = sc.hasNext() ? sc.nextInt() : null;
        int linux = sc.hasNext() ? sc.nextInt() : null;
        int git = sc.hasNext() ? sc.nextInt() : null;

        Grade ub = new Grade(network, linux, git);
        System.out.printf("평균: %d점", ub.average());
    }
}

