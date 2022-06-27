package DataType;

public class ArraySample {
    public static void main(String[] args) {
        int[] odds = { 1, 3, 5, 7, 9 };
        String[] weeks = { "월", "화", "수", "목", "금", "토", "일" };
        System.out.println(weeks[3]);
        for (int i = 0; i < weeks.length; i++) {
            System.out.println(weeks[i]);
        }
        System.out.println(weeks.length);
    }
}
