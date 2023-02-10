import java.util.*;
public class Pallindrome {
 

    public static void main(String[] args) 
    {
        int n, c,r,s=0;
        System.out.println("Enter any Number");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        c=n;
        
      while(n>0)
      {
        r=n%10;
        s=(s*10)+r;
        n=n/10;

      }
      if(c==s)
      {
        System.out.println("pallindrome number");
      }
      else{
        System.out.println("not Pallindrome");
      }
    }

}

