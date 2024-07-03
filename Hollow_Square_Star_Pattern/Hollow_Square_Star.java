import java.util.Scanner;

public class Hollow_Square_Star {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n  = sc.nextInt();
        printPattern(n);

    }   
    public static void printPattern(int n){
        for(int i=0; i<n ; i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    };
}
