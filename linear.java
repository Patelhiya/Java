import java.util.*;
class linear 
{
    public static void main()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no of array");
    int n=sc.nextInt();
    int a[]=new int[n];
    int i,pos=-1,flag=0;
    for(i=0;i<n;i++)
    {
        System.out.println("enter any number");
        a[i]=sc.nextInt();
    }
    System.out.println("enter the search number");
    int num=sc.nextInt();
    for(i=0;i<n;i++)
    {
        if(num==a[i])
        {
            pos=i+1;
        }
    }
    System.out.println(pos);
}
}