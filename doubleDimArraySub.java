import java.util.*;
class doubleDimArraySub
   {

       public static void main(String args[])
       {
            
        Scanner x = new Scanner(System.in);

        int [][]  a = new int [3][3];
	   int [][]  b = new int [3][3];
	   int [][]  c = new int [3][3];

          int row , col;
        System.out.println("Enter Elements In Matrix a");
           for(row=0; row<3; row++)
             {
              for(col=0; col<3; col++)
                a[row][col]=x.nextInt();
             }

			System.out.println("Enter Elements In Matrix b");
			
			for(row=0; row<3; row++)
             {
              for(col=0; col<3; col++)
                b[row][col]=x.nextInt();
             }

          System.out.println("Sum of Matrix a & b");
            
			for(row=0; row<3; row++)
              {
              for(col=0; col<3; col++)
                c[row][col]=a[row][col]-b[row][col];
             }

			System.out.println("Matrix a= ");
			for(row=0; row<3; row++)
              {
              for(col=0; col<3; col++)
               System.out.print(a[row][col]+" ");

				System.out.println();
			}
			System.out.println("Matrix b= ");
			for(row=0; row<3; row++)
              {
              for(col=0; col<3; col++)
			System.out.print(b[row][col]+" ");

				System.out.println();
			}

			System.out.println("Substraction of Both Matrices");
			for(row=0; row<3; row++)
              {
              for(col=0; col<3; col++)
			System.out.print(c[row][col]+" ");

				System.out.println();
			}

        }


  }

