import java.util.*;
class smith
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int i,j,rem,k=0,s=0,s1=0,cnt=0,c=0;
        for(i=1;i<=n;i++)
        {
         if (n%i==0)
         c=i;
        }
        
        while(c>0)
        {
            rem=c%10;
            s=s+rem;
            c=c/10;
        }
        while(n>0)
        {
            rem=n%10;
            s1=s1+rem;
            n=n/10;
        }
        if(s==s1)
        System.out.println("smith");
        else
        System.out.println("not a smith");
        
        }
        
        
        
    }
