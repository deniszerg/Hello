import java.util.Scanner;
//Metod kotorii
public class Main01 {
  Scanner scanner = new Scanner(System.in);

  public static int readInput() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("enter num from 1 to 10");
      int n = scanner.nextInt();
      if (1 <= n && n <= 10) {
        return n;
      }
    }

  }

  public static void main(String[] args) {
    int n = readInput();
    System.out.println("vi vveli chislo" + n);
    System.out.println("lalala blala");
    int[] arr={1,2,5,7};
  }
}

