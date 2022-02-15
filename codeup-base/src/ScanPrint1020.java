import java.util.*;

public class ScanPrint1020 {

  public static void main(String[] args) {
    System.out.print("주민등록번호를 입력하세요 (하이픈 포함)");
    Scanner sc = new Scanner(System.in);
    String data = sc.nextLine();
    System.out.printf("%s", data.replace("-", ""));
  }
}
