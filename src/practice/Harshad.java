package practice;

import java.util.Scanner;
//practice.Harshad or Niven number -A number is said to be the practice.Harshad number if it is divisible by the sum of its digit.
public class Harshad {
        public static void main(String[] args){
            System.out.println("Enter the number");
            Scanner sc= new Scanner(System.in);
            int num= sc.nextInt();
            int temp=num;
            int sum=0;
            //Calculates sum of digits
            while(num>0) {
               int rem=num%10;
               sum = sum +rem;
                num=num/10; //removes last digit of the variable num
            }
            //Checks whether number is divisible by sum of digits
            if (temp%sum==0) {
                System.out.println(temp + " is an harshad number");
            }
            else{
                System.out.println(temp+ " is not an harshad number");
            }
        }
    }

