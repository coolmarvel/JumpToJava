package ControllType;

public class ControllTypeTest {
    public static void main(String[] args) {
        // Q1 출력되는 문자열을 맞춰보자
        String a = "write once, run anywhere";
        if (a.contains("wife")) {
            System.out.println("wife");
        } else if (a.contains("once") && !a.contains("run")) {
            System.out.println("once");
        } else if (!a.contains("everywhere")) {
            System.out.println("everywhere");
        } else if (a.contains("anywhere")) {
            System.out.println("anywhere");
        } else {
            System.out.println("none");
        }
        // everywhere

        // Q2 while문을 사용해 1~1000까지의 자연수 중 3의 배수의 합을 구해보자
        int sum = 0;
        int i = 1;
        while (i <= 1000) {
            if (i % 3 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);

        // Q3 while문 or for문을 사용하여 *찍기 프로그램 작성
        int x = 0;
        while (true) {
            x++;
            if (x > 5) {
                break;
            }
            for (int j = 0; j < x; j++) {
                System.out.println("*");
            }
            System.out.println("");
        }

        // Q4 for문을 사용해 1~100까지의 숫자를 출력
        for (int j = 1; j < 101; j++) {
            System.out.println(j);
        }

        // Q5 for each문을 사용해 A학급의 평균점수를 구해보자.
        int[] marks = { 70, 60, 55, 75, 95, 90, 80, 80, 85, 100 };
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        float average = (float) total / marks.length;
        System.out.println(average);
    }
}
