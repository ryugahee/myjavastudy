package java0716;

public class Quiz_05 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88},
        };

        int sum = 0;
        float average = 0.0f;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        //average = sum / (float) array.length;

        System.out.printf("전체 합 : %d%n", sum);
        //System.out.printf("전체 평균 : %f", average);


    }
}
