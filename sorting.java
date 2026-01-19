import java.util.*;
class sorting
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int size=sc.nextInt();
        int a[]=new int[size];
        int i,j,temp,pos,small=0;
        for(i=0;i<size;i++)
        {
            System.out.println("enter an element");
            a[i]=sc.nextInt();
        }
        for(i=0;i<size;i++)
        {
            small=a[i];
            pos=i;
            for(j=i+1;j<size;j++)
            {
                if (a[j]<small)
                {
                    small=a[j];
                    pos=j;
                }
            }
            temp=a[pos];
            a[pos]=a[i];
            a[i]=temp;
        }
        System.out.println("sorted array");
        for(i=0;i<size;i++)
        {
        System.out.println(a[i]);
    }
}
}