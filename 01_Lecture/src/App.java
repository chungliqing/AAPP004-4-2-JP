import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        displayMessage();
    }

    public static void displayMessage() {
        System.out.println("Surely the best Java programmers come from Java!");
    }

    public static void usingScannerAPI() {\

        /*

         * Step 1:
            * import java.util.Scanner;
         * Step 2:
            * instantiate Scanner object;
            * Scanner sc = new Scanner(System.in);
         * Step 3:
            * use sc
            * number1 = sc.nextInt()      

         */

        Scanner keyboardInput = new Scanner(System.in);

        int number1, number2, sum;
        System.out.print("Your first number: ");
        number1 = keyboardInput.nextInt();

        System.out.print("Your second number: ");\
        number2 = keyboardInput.nextInt();

        sum = number1 + number2;

        System.out.println("The sum of the two numbers is: " + sum);
    }
}
