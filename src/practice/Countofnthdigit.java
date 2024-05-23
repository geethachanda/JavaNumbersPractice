package practice;

import java.util.Scanner;

    public class Countofnthdigit {
        public static void main(String[] args){
            System.out.println("Enter the number:");
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            int count=0;
            while(n>0) {
                   n = n / 10;
                  count++;
               }

            System.out.println("The count of entered digits is " +count);
            System.out.println("The n is " +n);
        }
    }

