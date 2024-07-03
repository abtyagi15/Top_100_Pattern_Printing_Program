/*

Following pattern need to print

********
********
********
********
********
********
********
********
 
 */

import java.util.Scanner;

public class Square_Star{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stars on a edge: ");
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }
    public static void printPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}