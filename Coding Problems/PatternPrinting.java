import java.util.Scanner;
public class PatternPrinting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=5;

        //Right Angle Traingle
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
         
        //Reverse Right Angle Triangle
        System.out.println("\nReverse Traingle\n");

        for(int i=1;i<=num;i++)
        {
            for(int j=i;j<=num;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------------------");

        for(int i=1;i<=num;i++)
        {
            for(int j=i;j<=num;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
       

        System.out.println("---------------------");

        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=num;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("---------------------");

        for(int i=1;i<=num;i++)
        {
            for(int j=i;j<=num;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
             

        System.out.println("---------------------");
        

        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<num;j++)
            {
                System.out.print("*");
            }
            for(int j=i;j<=num;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------------------");
        for(int i=1;i<num;i++)
        {
            for(int j=i;j<=num;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
         

        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<num;j++)
            {
                System.out.print("*");
            }
            for(int j=i;j<=num;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

           
    }
}
