package TotalTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Test {

    // Q4
    static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 2) + fibo(n - 1);
        }
    }

    public static void main(String[] args) throws IOException {
        // Q1
        String a = "a:b:c:d";
        String[] temp = a.split(":");
        String result = String.join("#", temp);
        System.out.println(result);

        // Q2
        HashMap<String, Integer> b = new HashMap<>();
        b.put("A", 90);
        b.put("B", 80);
        System.out.println(b.getOrDefault("C", 70));

        // Q3
        int[] A = { 20, 55, 67, 82, 45, 33, 90, 87, 100, 25 };
        int total = 0;
        for (int i : A) {
            if (i >= 50) {
                total += i;
            }
        }
        System.out.println(total);

        int total1 = Arrays.stream(A).filter((i) -> i >= 50).sum();
        System.out.println(total1);

        // Q4
        for (int i = 0; i < 10; i++) {
            System.out.println(fibo(i));
        }

        // Q5
        // Scanner sc = new Scanner(System.in);
        // System.out.print("구구단을 출력할 숫자를 입력하세요(2~9)");
        // int input = sc.nextInt();
        // for (int i = 1; i < 10; i++) {
        // System.out.printf("%d", i * input);
        // System.out.printf(" ");
        // }
        // sc.close();

        // Q6
        // Scanner sc1 = new Scanner(System.in);
        // System.out.print("입력해 주세요: ");
        // String userInput = sc1.nextLine();
        // String[] numbers = userInput.split(",");
        // int sum = 0;
        // for (String num : numbers) {
        // num = num.trim();
        // int n = Integer.parseInt(num);
        // sum += n;
        // }
        // System.out.printf("총합은 %d입니다.\n", sum);
        // sc1.close();

        // Q7
        // ArrayList<String> lines = new ArrayList<>();

        // BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        // while (true) {
        // String line = br.readLine();
        // if (line == null) {
        // break;
        // }
        // lines.add(line);
        // }
        // br.close();

        // lines.sort(Comparator.reverseOrder());

        // PrintWriter pw = new PrintWriter("result.txt");
        // for (String line : lines) {
        // pw.println(line);
        // }
        // pw.close();

        // Q8
        ArrayList<String> lines = new ArrayList<>();

        // 파일을 읽어 각 라인을 lines에 저장한다.
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            lines.add(line);
        }
        br.close();

        // 총합과 평균값을 구한다.
        int tot = 0;
        for (String line : lines) {
            line = line.trim(); // 공백을 제거한다.
            int num = Integer.parseInt(line); // 문자열을 숫자로 변환한다.
            tot += num;
        }
        float average = (float) tot / lines.size(); // 평균값은 실수로 계산한다.
        System.out.printf("총합:%d, 평균:%.2f\n", tot, average);

        // 평균값을 result.txt에 저장한다.
        PrintWriter pw = new PrintWriter("result.txt");
        pw.write(String.format("%.2f", average)); // 실수를 문자열로 변환하여 저장한다.
        pw.close();
    }
}
