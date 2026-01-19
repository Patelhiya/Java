import java.util.*;
class p8
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int rem,s=0,p=1;
        while(n>0)
        {
            rem=n%10;
            
            s=s+rem;
            p=p*rem;
            n=n/10;
            
        }
        if(s==p)
        System.out.println("spy");
        else 
        System.out.println("not a spy");
        
    }
}