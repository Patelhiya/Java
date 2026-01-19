import java.util.*;
class bubble
{
    public static void main()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no of elements you want in array");
    int size=sc.nextInt();
    int a[]=new int[size];
    int i,j,temp;
    for(i=0;i<size;i++)
    {
        System.out.println("Enter any value");
        a[i]=sc.nextInt();
    }
    for(i=0;i<size;i++)
    {
        for(j=0;j<size-1-i;j++)
        {
            if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    System.out.println("sorted array");
    for(i=0;i<size;i++)
    {
        System.out.println(a[i]);
    }
        
    }
}
