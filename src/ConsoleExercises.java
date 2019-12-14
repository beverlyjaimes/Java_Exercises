import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args) {
    double pi = 3.14159;

        System.out.println("The value of pi is " + pi + ".");

        Scanner input = new Scanner(System.in);

//        System.out.print("Enter something: ");
//        String userInput = scanner.next();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.println("Enter a number:");
        int userInput =  input.nextInt();

//        use new line and new int

    }

}

//    Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//
//        What happens if you input something that is not an integer?
//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//
//        What happens if you enter less than 3 words?
//        What happens if you enter more than 3 words?
//        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//
//        do you capture all of the words?
//        Rewrite the above example using the nextLine method.