//Hour - Glass Patter problem

import java.io.*;
import java.util.Scanner;
class HgPattern
{
    // Function definition
    static void pattern(int rows_no)
    {
        int i, j, k;
     
        // for loop for printing
        // upper half
        for (i = 1; i <= rows_no; i++) {
     
            // printing i spaces at
            // the beginning of each row
            for (k = 1; k < i; k++)
                System.out.print(" ");
             
            // printing i to rows value
            // at the end of each row
            for (j = i; j <= rows_no; j++)
                System.out.print(j + " ");
     
            System.out.println();
        }
     
        // for loop for printing lower half
        for (i = rows_no - 1; i >= 1; i--)
        {
            // printing i spaces at the
            // beginning of each row
            for (k = 1; k < i; k++)
                System.out.print(" ");
             
            // printing i to rows value
            // at the end of each row
            for (j = i; j <= rows_no; j++)
                System.out.print(j + " ");
     
            System.out.println();
        }
    }
     
    // Driver code
    public static void main (String[] args)
    {
        // taking rows value from the user
        int rows_no;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:  ");
        rows_no = sc.nextInt();
        
        
     
        pattern(rows_no);
        
        
        sc.close();
        
    }
}
