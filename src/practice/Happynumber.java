package practice;

import java.util.Scanner;

public class Happynumber {
    /*The happy number can be defined as a number which will yield 1 when it is replaced by the sum of the square of its digits repeatedly.
    If this process results in an endless cycle of numbers containing 4, then the number is called an unhappy number. */

        public static void main(String[] args) {
            System.out.println("Enter the number");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt(); //ex: 1234
            int temp = num;
            int sum=0;

            while(num!=1 && num!=4) {
                while(num>0){
                int rem = num % 10;
                sum = sum + (rem * rem); // ex:10, 1
                num = num / 10;//removes last digit of the variable num
            }
                   num = sum; //10, 1
                    sum = 0;
                    }
            if(num == 1) {
                System.out.println(temp + " is a Happy number");
            } else if(num==4) {
                System.out.println(temp + " is not a Happy number");
            }


        }
    }


