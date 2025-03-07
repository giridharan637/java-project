import java.util.*;

 class reverse 
{
    public static void main(String[] args) 
    {
        
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
    
        int rem, rev=0;

        while(n!=0)
        {
            rem = n%10;
            rev = rem*10+rem;
            n = n/10;
        }
        System.out.println(rev);
}

}
    