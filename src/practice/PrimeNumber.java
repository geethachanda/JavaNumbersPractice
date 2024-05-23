package practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int i, flag=1;
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<=1){
            flag = 0;
        }
        for(i=2; i<num; i++) {

            if (num % i == 0) {
               flag = 0;
                break;
            }
        }
        if(flag==0){
            System.out.println(num+ " is not a prime number");
        }
    else{
            System.out.println(num+ " is prime number");
        }
    }
}
