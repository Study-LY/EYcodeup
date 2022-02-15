import java.util.*;

public class ScanPrint1019 {

  public static void main(String[] args) {
    System.out.printf("날짜를 입력하세요 ('.' 온점으로 구분) ");
    Scanner sc = new Scanner(System.in);
    String dataAll = sc.nextLine();
    String[] data = dataAll.split("\\.");
    if (data.length > 2) {
      System.out.printf("%s.%02d.%02d", data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
    } else {
      System.out.printf("끝");
    }
  }
}
