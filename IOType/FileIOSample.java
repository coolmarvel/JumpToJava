package IOType;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIOSample {
    public static void main(String[] args) throws IOException {
        // 파일을 생성하기 위해서 FileOutputStream 객체를 생성 사용
        // output.close() 문장을 통해서 사용한 파일 객체를 닫아주는 것.
        // 다시 사용하려고 할 경우 안닫았을 시 에러가 발생할 수 있음.
        FileOutputStream output = new FileOutputStream("C:/Users/이성현/Desktop/out.txt");
        for (int i = 1; i < 11; i++) {
            String data = i + " 번째 줄입니다.\r\n";
            output.write(data.getBytes());
        }
        // FileOutputStream에 값을 쓸 때는 byte배열로 써야 하므로 위와같이 String을 byte배열로 바꾸어 주는
        // getBytes() 메서드를 이용했다. \r\n은 줄바꿈 문자이다.
        output.close();

        FileWriter fw = new FileWriter("C:/Users/이성현/Desktop/out.txt", true); // true 추가시 파일을 추가 모드로 연다.
        for (int i = 1; i < 11; i++) {
            String data = i + " 번째 줄입니다.\r\n";
            fw.write(data);
        }
        fw.close();

        // 두 프로그램의 차이점은 data를 출력시키는 방법이다. 두 번째 방법은 우리가 지금껏 계속 사용해 왔던 콘솔 출력 방법이고 첫 번째 방법은
        // 콘솔대신에 파일로 출력하는 방법이다. 차이점이 금방 눈에 들어 올 것이다. System.out대신에 PrintWriter의 객체를 사용한
        // 차이가 있을 뿐이다.

        PrintWriter pw = new PrintWriter("c:/out.txt");
        for (int i = 1; i < 11; i++) {
            String data = i + " 번째 줄입니다.";
            pw.println(data);
        }
        pw.close();

        PrintWriter pw2 = new PrintWriter(new FileWriter("C:/Users/이성현/Desktop/out.txt", true));
        for (int i = 11; i < 21; i++) {
            String data = i + " 번째 줄입니다.";
            pw2.println(data);
        }
        pw2.close();
    }
}
