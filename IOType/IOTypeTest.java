package IOType;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class IOTypeTest {
    public static void main(String[] args) throws IOException {
        // Q1 두 개의 숫자를 입력받아 그 합을 출력하는 프로그램을 작성
        // Scanner sc = new Scanner(System.in);
        // System.out.print("첫 번째 숫자를 입력하세요: ");
        // int first = sc.nextInt();
        // System.out.print("두 번째 숫자를 입력하세요: ");
        // int second = sc.nextInt();
        // int result = first + second;
        // System.out.printf("%d + %d = %d 입니다.%n", first, second, result);

        // Q2 영문을 입력하고 엔터를 입력하면 입력한 영문을 대문자로 변경하여 출력하는 프로그램을 작성하시오.
        // (단, 사용자가 "END" 라는 문자열을 입력하기 전까지 반복해서 문장을 입력받을 수 있게 할것)
        // while (true) {
        // System.out.print("영어 문장을 입력하세요: ");
        // String line = sc.nextLine();
        // if ("END".equals(line) || "end".equals(line)) {
        // break;
        // }
        // System.out.println(line.toUpperCase());
        // }

        // Q3 다음은 "sample.txt"라는 파일에 "Write once, run anywhere" 문자열을 저장한 후 다시 그 파일을 읽어서
        // 출력하는 프로그램이다. 이 프로그램은 우리가 예상한 "Write once, run anywhere"라는 문장을 출력하지 않고 null을
        // 출력한다. 우리가 예상한 값을 출력할 수 있도록 프로그램을 수정해 보자.
        // FileWriter fw = new FileWriter("sample.txt");
        // fw.write("Write once, run anywhere");
        // fw.close();

        // BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        // String line = br.readLine();
        // System.out.println(line);
        // br.close();

        // Q4 사용자의 입력을 파일(sample.txt)에 저장하는 프로그램을 작성해 보자.
        // (단 프로그램을 다시 실행하더라도 기존에 작성한 내용을
        // 유지하고 새로 입력한 내용을 추가해야 한다.)
        // FileWriter fw = new FileWriter("sample.txt", true);
        // System.out.print("문장을 입력하세요: ");
        // Scanner sc = new Scanner(System.in);
        // String line = sc.nextLine();
        // fw.write(String.format("%s\n", line));
        // fw.close();
        // sc.close();

        // Q5 sample.txt 파일이 있다. 이 파일의 내용 중 "python" 이라는 문자열을 "java"로 바꾸어서 저장해 보자.
        ArrayList<String> data = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            data.add(line);
        }
        br.close();

        String text = String.join("\n", data);

        text = text.replaceAll("python", "java");

        FileWriter fw = new FileWriter("sample.txt");
        fw.write(text);
        fw.close();
    }
}
