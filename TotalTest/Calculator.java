package TotalTest;

import java.util.Arrays;

class Cal {
    int[] data;

    public Cal(int[] data) {
        this.data = data;
    }

    public int sum() {
        return Arrays.stream(data).sum();
    }

    public float avg() {
        return (float) sum() / data.length;
    }
}

public class Calculator {
    public static void main(String[] args) {
        int[] data1 = { 1, 2, 3, 4, 5 };
        Cal cal1 = new Cal(data1);
        System.out.println(cal1.sum()); // 15 출력
        System.out.println(cal1.avg()); // 3.0 출력

        int[] data2 = { 6, 7, 8, 9, 10 };
        Cal cal2 = new Cal(data2);
        System.out.println(cal2.sum()); // 40 출력
        System.out.println(cal2.avg()); // 8.0 출력
    }
}
