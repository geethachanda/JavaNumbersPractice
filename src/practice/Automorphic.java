package practice;

import java.util.Scanner;

public class Automorphic
{
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int square= num*num;
        int temp=num;
        int count=0;

        while(num>0) {
            count++;
          num=num/10; //removes last digit of the variable num
        }
        //determines the last digits of the variable square matching with the number
            int lastd = (int) (square % Math.pow(10, count));
              //compare num with last digit of the variable square
            if (temp == lastd) {
                System.out.println(temp + " is an automorphic number");
            }
            else{
                System.out.println(temp+ "is not an automorphic number");
            }
        }
        }



