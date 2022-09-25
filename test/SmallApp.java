import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class SmallApp {
    public static void main(String[] args) {

        int guess = 50;
        int counter = 1;
       Scanner input = new Scanner(System.in);
//        for(counter = 0; counter <= 3; counter++) {
//
//            System.out.println("Enter a number:");
//            int number1 = input.nextInt();
//
//            if (number1 < guess) {
//                System.out.println("Too low");
//
//            } else if (number1 > guess) {
//                System.out.println("Too high");
//            } else {
//                System.out.println("perfect");
//            }
//            break;
//     while(counter <= 10){
//         System.out.print(" " +counter);
//          counter = counter + 2;
        while (counter > 20) {

            counter = counter - 1;
        }
        System.out.printf("Enter a number %d");
      }

    }
