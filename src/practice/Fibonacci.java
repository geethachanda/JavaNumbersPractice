package practice;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum=0;
        if (n<1){
            System.out.print("Please enter the number greater than zero");
        }
        else if (n==1){
            System.out.print(a);
        }
        else {
            System.out.print(a + " " + b);
            for (int i = 2; i < n; i++) {
                sum = a + b;
                System.out.print(" " + sum);
                a = b;
                b = sum;
            }
        }
    }
}
