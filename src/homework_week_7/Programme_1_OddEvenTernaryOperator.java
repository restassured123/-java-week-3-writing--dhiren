package homework_week_7;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme_1_OddEvenTernaryOperator {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num = scanner.nextInt();
        isItOddOrEvenNumber(num);
        scanner.close();
    }

    public static void isItOddOrEvenNumber( int num){
        String evenOrOdd = (num %2 ==0) ? " Even " : " Odd " ;
        System.out.println("The " + num + " is " + evenOrOdd + " num ");

    }


}
