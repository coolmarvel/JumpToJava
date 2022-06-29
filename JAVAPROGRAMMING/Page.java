package JAVAPROGRAMMING;

public class Page {
    static int getTotalPage(int m, int n) {
        return m / n + 1;
    }

    public static void main(String[] args) {
        System.out.println(getTotalPage(5, 10));
        System.out.println(getTotalPage(15, 10));
        System.out.println(getTotalPage(25, 10));
        System.out.println(getTotalPage(30, 10));
    }
}
