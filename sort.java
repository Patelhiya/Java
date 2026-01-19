import java.util.*;
class sort
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);

        int a[][]=new int[3][3];
        int b[]=new int[9];
        int i,j,k=0,small,temp,pos;

        for (i=0;i<3;i++)
        {
            for (j=0;j<3;j++)
            {
                System.out.println("Enter a number");
                a[i][j]=sc.nextInt();

                b[k++]=a[i][j];
            }
        }

        for (i=0;i<9;i++)
        {
            small=a[i];
            pos=i;
            for (j=i+1;j<9;j++)
            {
              if(a[j]<small)
              {
                  small=a[j];
                  pos=j;
              }
            }
            temp=a[i];
            a[i]=a[pos];
            a[pos]=temp;
        }
        k=0;
         for (i=0;i<3;i++)
        {
            for (j=0;j<3;j++)
            {
                a[i][j]=b[k++];
                System.out.println(a[i][j]+"\t");
            }

               System.out.println();
            }
        }
    }