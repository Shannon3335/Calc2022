package ie.atu.week4;

import java.util.Scanner;

public class Calc {
    public int multiply(int x,int y)
    {
        int z = x * y;
        return z;
    }
    public static void main(String[] args) {


    }
    public int subtract_Calc(int x, int y)
    {
        return (x-y); 
        }
    public static void AddCalc(){
        System.out.println("Please Enter Your First Number");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please Enter Your Second Number");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("The total is " + total)
    }
}
