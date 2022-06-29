package JAVAPROGRAMMING;

public class ExcludeSpaceCount {
    static int getExcludeSpaceCount(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getExcludeSpaceCount("공백을 제외한 글자수"));
        System.out.println(getExcludeSpaceCount("점프 투 자바의 연습문제 풀이"));
    }
}
