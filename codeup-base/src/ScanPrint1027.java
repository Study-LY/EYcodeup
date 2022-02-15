import java.util.*;

public class ScanPrint1027 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] data = sc.nextLine().split("\\.");
    System.out.printf("%02d-%02d-%04d", Integer.parseInt(data[2]),Integer.parseInt(data[1]),Integer.parseInt(data[0]));
  }
}
