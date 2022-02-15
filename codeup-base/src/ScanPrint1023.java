import java.util.*;

public class ScanPrint1023 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String dataAll = sc.nextLine();
    String[] data = dataAll.split("\\.");

    System.out.printf("%s\n%s", data[0], data[1]);
  }
}
