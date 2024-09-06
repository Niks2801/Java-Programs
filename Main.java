
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] sum = new int[3][3];

        int i=0, j=0;
        System.out.println("enter values of first matrix");
        for (i = 0; i < 3; i++)
            for (j = 0; i < 3; j++)
                A[i][j] = sc.nextInt();

        System.out.println("enter values of second matrix");
        for (i = 0; i < 3; i++)
            for (j = 0; i < 3; j++)
                B[i][j] = sc.nextInt();


        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++)
                B[i][j] = sc.nextInt();
                sum[i][j] = A[i][j] + B[i][j];

        System.out.println("Sum of two matrices:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++)
                System.out.print(sum[i][j] + " ");
            System.out.println();
        }
    }
}


