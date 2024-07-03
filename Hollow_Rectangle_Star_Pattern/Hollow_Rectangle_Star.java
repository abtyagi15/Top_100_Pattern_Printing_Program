/*
Print the following pattern
*****
*   *
*   *
***** 

 */

import java.util.Scanner;

public class Hollow_Rectangle_Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        printPattern(rows,cols);
    }
    public static void printPattern(int rows, int cols){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==0 || j==0 || i==rows-1 || j==cols-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
