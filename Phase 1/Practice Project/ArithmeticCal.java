package com.javatraining;
import java.util.Scanner;

public class calci {
    public static void main(String[] args) {

        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter Your choice");

        int cal = new Scanner(System.in).nextInt();

        switch(cal){
            case 1:
                System.out.println("Enter your 1st number");
                int add1 = new Scanner(System.in).nextInt();

                System.out.println("Enter your 2nd number");
                int add2 = new Scanner(System.in).nextInt();

                System.out.print("Your answer is ");
                System.out.println(add1+add2);
                break;

                case 2:
                System.out.println("Enter your 1st number");
                int sub1 = new Scanner(System.in).nextInt();

                System.out.println("Enter your 1st number");
                int sub2 = new Scanner(System.in).nextInt();

                System.out.print("Your answer is ");
                System.out.println(sub1-sub2);
                break;

                case 3:
                System.out.println("Enter your 1st number");
                int mul1 = new Scanner(System.in).nextInt();

                System.out.println("Enter your 2nd number");
                int mul2 = new Scanner(System.in).nextInt();

                System.out.print("Your answer is ");
                System.out.println(mul1*mul2);
                break;

                case 4:
                System.out.println("Enter your 1st number");
                int div1 = new Scanner(System.in).nextInt();

                System.out.println("Enter your 2nd number");
                int div2 = new Scanner(System.in).nextInt();

                System.out.print("Your answer is ");
                System.out.println(div1/div2);
                break;

                default:
                System.out.println("You have entered wrong choice");
                break;
        }
    }
}

