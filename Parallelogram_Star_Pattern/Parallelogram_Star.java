/*
 Print the following pattern
 
 *****
  *****
   *****
    *****
 
 */

import java.util.Scanner;

public class Parallelogram_Star {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of cols: ");
        int cols = sc.nextInt();
        printPattern(rows,cols);
    }
    public static void printPattern(int rows,int cols){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols+i;j++){
                if(j<i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
