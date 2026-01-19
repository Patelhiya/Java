import java.util.*;
class p2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int i,s=0;
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        if(s==n)
        {
            System.out.println("perfecr");
        }
            else
            System.out.println("not a perfect");
        }
    }
        