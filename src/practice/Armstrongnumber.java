package practice;

import java.util.Scanner;
/* To verify the given number is armstrong or not*/
public class Armstrongnumber {
    public static void main(String[] args){
        int count=0;
        int sum=0;
        System.out.println("Enter the number to check:");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();//ex: 153
        int temp=num;
        while(num>0){
            count++; // count=0 count=1, count=2, count=3
            num=num/10; // 153, 15, 1, 0
        }
          num=temp;
        while(num>0){
           int rem=num%10; // 3, 5, 1
           sum=sum+ (int) Math.pow(rem, count); //
           num/=10;
        }
        if(temp==sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }
}
