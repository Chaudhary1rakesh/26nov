import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;
public class lower_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row");
        int rows=sc.nextInt();
        System.out.println("Enter the number of colomn");
        int cols=sc.nextInt();
        int matrix[][]=new int [rows][cols];
        if(rows!=cols){
            System.out.println("Not squre matrix");
        }
        else{
            System.out.println("Enter element of matrix");
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<rows;j++)
                {
                    matrix[i][j]=sc.nextInt();

                }
            }
            System.out.println("Input matrix is:");
            for(int i=0;i<rows;i++){
                for(int j=0;j<rows;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("lower triangle:");
            for(int i=0;i<rows;i++){
                for(int j=0;j<rows;j++){
                    if(j>i)
                    System.out.print("0 ");
                    else
                    System.out.print(matrix[i][j]+ " ");
                }
                System.out.println();
            }
        }
    }
    // sc.close();

    
}
