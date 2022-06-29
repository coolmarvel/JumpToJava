package JAVAPROGRAMMING;

public class ThreeFive {
    public static void main(String[] args) {
        // 3과 5의 배수 합하기
        int result = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        System.out.println(result);
    }
}
