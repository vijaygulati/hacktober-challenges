package Lec_4_Functions;

//this is for reversing a number

import java.util.Scanner;

import static java.lang.Math.pow;

public class inverse {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter no. of digits in a no.");
        int n=s.nextInt();// input the number of digits availablle in the number
        System.out.println("enter no. please enter digits from 1 to "+n);
        int num=s.nextInt();//  input the the number of which you want to find the inverse
        System.out.println(inver(n,num));  //      calling the function inver to find the inverse of the no.
    }
    public  static double inver(int n, int num){ //     function to find the inverse of a no.
        int p=1;
        int t=0;
        double inv=0;
        while(p<=n){        //  while loop to tell the code when to stop
            t=num%10;
            inv=inv+p*pow(10,(t-1));
            num=num/10;
            p++;
        }
        return inv;     //  returning the value of inverse from the function
    }
}
