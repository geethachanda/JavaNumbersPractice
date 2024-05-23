package practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        System.out.println("Enter the number");//sout tab
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //consider n=125
        int temp=n;
        int sum=0;
        while(n>0){
            int rem=n%10; //125% 10=5, 12%10=2, 1%10=1
            sum= (sum*10)+(rem); //sum=5, sum=50+2=52, sum=520+1=521
            n=n/10;
        }
        System.out.println("The reverse of entered digits is " +sum);
        System.out.println("The n is " +n);
        if(temp==sum){
            System.out.println("Hurray!!! The entered number is a practice.Palindrome");
        }
        else{
            System.out.println("OOPS!!! The entered number is not a practice.Palindrome");
        }
    }
}
