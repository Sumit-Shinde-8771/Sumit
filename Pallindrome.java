import java.util.*;
public class Pallindrome {
 

    public static void main(String[] args) 
    {
      while(true){
        int n, c,r,s=0;
        System.out.println("Enter any Number");
        Scanner sc =new Scanner(System.in);
        System.out.println("0 for Exit..!!");
        n=sc.nextInt();
        c=n;
        if(n==0){
          System.out.println("Thank you..!!");
          break;
        }
      while(n>0)
      {
        r=n%10;
        s=(s*10)+r;
        n=n/10;
        int z = 0;

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

}

