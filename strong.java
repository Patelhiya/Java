import java.util.*;
class strong
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        int i,j,k=0,s=0;
        int a[][]=new int[3][3];
        int b[]=new int[8]; 

        for (i=0;i<=2;i++)
        {
            for (j=0;j<=2;j++)
            {
                System.out.println("enter any number ");
                a[i][j]=sc.nextInt();
            }
        }

            for (i=0;i<=2;i++)
            {
                s=0;
                for (j=0;j<=2;j++)
                {
                    s=s+a[i][j];
                }
                b[k++]=s;
            }

            for (i=0;i<=2;i++)
            {
                s=0;
                for (j=0;j<=2;j++)
                {
                    s=s+a[j][i];
                }
                b[k++]=s;
            }

            s=0;
            for (i=0;i<=2;i++)
            {
                for (j=0;j<=2;j++)
                {
                    if(i==j)
                    {
                        s=s+a[j][i];
                    }
                }
            }
                b[k++]=s;

                s=0;
                for (i=0;i<=2;i++)
                {
                    for (j=0;j<=2;j++)
                    {
                        if(i+j==2)
                        {
                            s=s+a[j][i];
                        }
                    }
                    b[k++]=s;

                    System.out.println("original matrix");
                    s=0;
                    for (i=0;i<=2;i++)
                    {
                        for (j=0;j<=2;j++)
                        {
                            System.out.print(a[i][j]+"\t");
                            
                        }
                        System.out.println();
                    }
                }
            }
        }
                        
 