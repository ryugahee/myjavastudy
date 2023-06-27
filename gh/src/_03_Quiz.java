public class _03_Quiz {
    public static void main(String[] args) {
        int height1 = 119;
        int height2 = 130;
        String result1 = (height1>=120) ? "탑승 가능" : "탑승 불가능";
        String result2 = (height2>=120) ? "탑승 가능" : "탑승 불가능";
        System.out.println("키가 " + height1 + " 이므로 " + result1 + "합니다.");
        System.out.println("키가 " + height2 + " 이므로 " + result2 + "합니다.");
    }
}
