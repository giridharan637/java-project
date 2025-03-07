import java.util.Scanner;
class Arathmetic
 {
   public static void main(String args[]) {
      Scanner giri = new Scanner(System.in);

      int a = giri.nextInt();
      int b = giri.nextInt();
      int c = a + b;
      int d = a - b;
      int e = a * b;
      float f = a / b;
      float g = a % b;
      System.out.println(a);
      System.out.println(b);
      System.out.println( + c);
      System.out.println("a-b=" + d);
      System.out.println("a*b=" + e);
      System.out.println("a/b=" + f);
      System.out.println("a%b=" + g);

   }
}
