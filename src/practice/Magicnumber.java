package practice;

import java.util.Scanner;

public class Magicnumber {
    /*Magic number
    if the sum of its digits recursively is calculated till a single digit.
    If the single digit is 1 then the number is called a magic number */

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //ex: 1234
        int temp = num;
        int sum=0;

        while(num>9) {
            while (num > 0) {
                int rem = num % 10;
                sum = sum + rem; // ex:10, 1
                num = num / 10;//removes last digit of the variable num 
            }
                num = sum; //10, 1
                sum = 0;
            }
            if(num == 1) {
                System.out.println(temp + " is a magic number");
            } else {
                System.out.println(temp + " is not a magic number");
            }


    }
}
