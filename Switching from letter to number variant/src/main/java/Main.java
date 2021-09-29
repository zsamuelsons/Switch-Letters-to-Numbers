import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.print("This is a design for a person to enter in any letter of the alphabet and ");
        System.out.println(" print out its counterpart to number.");
        System.out.print("Please enter in a lowercase letter ");
        System.out.println(" such as a, b, c... etc.");
        String answer = userInput.next();
        char ch = answer.charAt(0);

        Switcher letter = new Switcher(ch);
        char g = 'y';
        while(g == 'y') {
            if (answer.length() != 1) {
                System.out.println("Please enter in a lowercase letter.");
                answer = userInput.next();
            } else {
                g = 'n';
                letter.switchSolver(ch);
            }
        }

    }
}
