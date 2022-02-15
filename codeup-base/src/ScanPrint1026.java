import java.util.*;

public class ScanPrint1026 {

  public static void main(String[] args) {
    System.out.print("시:분:초 형식으로 입력");
    Scanner sc = new Scanner(System.in);
    String[] data = sc.nextLine().split(":");
    System.out.printf("%02d", Integer.parseInt(data[1]));

  }
}
