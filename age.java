import java.util.Scanner;

class age 
 {
  public static void main()  
  {
      Scanner a = new Scanner(System.in);
      int b = a.nextInt();
      System.out.println(b);
      if(b>=18)
      {
        System.out.println("vote eligible");
  } else{
    System.out.println(" not vote eligible");
  }
  }
}
