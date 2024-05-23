package practice;

import java.util.Scanner;
public class Palindromewithinrange {
    public static void main(String[] args){
        System.out.println("Enter the lower and upper limit");
        Scanner sc=new Scanner(System.in);
        int l= sc.nextInt();
        int u=sc.nextInt();
        for(int i=l;i<=u;i++) {
          int temp=i;
            int sum=0;
            while (temp > 0) {
                int rem = temp % 10;
                sum = (sum*10) + rem;
                temp = temp / 10;
            }
                if (sum == i)
                    System.out.println(i + "is a palindrome");
        }

    }

}