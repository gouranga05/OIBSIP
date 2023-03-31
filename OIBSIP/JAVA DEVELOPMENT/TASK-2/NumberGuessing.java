package OIBSIP;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Random rand= new Random();
        int random= rand.nextInt(100);
        Scanner sc= new Scanner(System.in);

        int count=0;
        while(true) {
            int number= sc.nextInt();
            if (number > random) {
                System.out.println("Lesser");
            } else if (number == random) {
                System.out.println("Congratulations");
                break;
            } else System.out.println("Greater");
            count++;
        }
        System.out.println("You guessed the number in " + count + " times");
    }
}
