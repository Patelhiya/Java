import java.util.*;
class insetsort
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int size=sc.nextInt();
        int a[]=new int[size];
        int i,j;
        for(i=0;i<size;i++)
        {
            System.out.println("enter an element");
            a[i]=sc.nextInt();
        }
        for(i=1;i<size;i++)
        {
           int key=a[i];
           j=i-1;
           while((j>-1)&&(a[j]>key))
           {
               a[j+1]=a[j];
               j--;
           }
           a[j+1]=key;
        }
        System.out.println("sorted array");
        for(i=0;i<size;i++)
        {
        System.out.println(a[i]);
    }
}
}