import java.util.*;
class p903
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,s=0;
        int a[]=new int[5];
        for(i=0;i<=4;i++)
        {
        System.out.println("enter any number");
        a[i]=sc.nextInt();
    }
    for(i=0;i<=4;i++)
    {
        s=s+a[i];
    }
    System.out.println(s);
    }
}