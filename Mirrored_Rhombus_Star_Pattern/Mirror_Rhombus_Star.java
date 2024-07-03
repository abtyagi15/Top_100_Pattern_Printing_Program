/*
 
Print the Following Pattern
     ******
    ******
   ******
  ******
 ******
******
 
 */

import java.util.Scanner;

public class Mirror_Rhombus_Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        printPattern(rows);         
    }
    public static void printPattern(int rows){
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows+rows-1-i;j++){
                if(j>=0 && j<rows-1-i){
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
