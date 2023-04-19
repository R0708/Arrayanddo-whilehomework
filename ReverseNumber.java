import java.util.Scanner;

//to input the 5 digit number and then reverse it
public class ReverseNumber {

    //main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 5 Digit Number");

        int number = scanner.nextInt();
        int reverse = 0;

        while (number!=0){
            int reminder=number%10;
            reverse = reverse*10 + reminder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: "+ reverse);
    }
}
