import java.util.*;
class p205
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter no of elements you want");
        int n=sc.nextInt();
        int i,s=0;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("enter any number");
            a[i]=sc.nextInt();
            
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                s=s+a[i];
            }
        }
        System.out.println(s);
    }
}