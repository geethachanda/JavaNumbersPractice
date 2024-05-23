package practice;

import java.util.Scanner;

public class Evenaltarmstrongreverse {

    /*printing armstrong numbers in the even positions in the reverse order*/
    public static void main(String[] args) {
        System.out.println("Enter the lower and upper limit to check:");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int u = sc.nextInt();
        int total = 0;
        for (int i = u; i >=l; i--) {
            int num = i;
            int count = 0;
            int sum = 0;
            int temp = num;
            while (num > 0) {
                count++; // count=0 count=1, count=2, count=3
                num = num / 10; // 153, 15, 1, 0
            }
            num = temp;
            while (num > 0) {
                int rem = num % 10; // 3, 5, 1
                sum = sum + (int) Math.pow(rem, count); //
                num /= 10;
            }
            if (temp == sum) {
                total++;
                if (total % 2== 0) {
                    System.out.println(sum + "is armstrong number");
                }
            }


        }
    }
}

