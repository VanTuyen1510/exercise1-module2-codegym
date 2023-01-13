package Main1;
import java.util.Scanner;

public class ReadNumberIntoWords {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your number");
        int number = s.nextInt();
        if(number >= 0 && number < 10){
            switch (number){
                case 0 :
                    System.out.println("zelo");
                    break;
                case 1 :
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3 :
                    System.out.println("three");
                    break;
                case 4 :
                    System.out.println("four");
                    break;
                case 5 :
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7 :
                    System.out.println("seven");
                    break;
                case 8 :
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        }
        else if(number < 20 && number >= 10){
            switch (number){
                case 10:
                    System.out.println("Ten");
                    break;
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twele");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Eighteen");
                    break;
                case 19:
                    System.out.println("Nineteen");
                    break;

            }
        }

    }
}
