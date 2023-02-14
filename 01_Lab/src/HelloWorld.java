public class HelloWorld { //Class Name
    public static void main(String[] args) { //Main Function
        firstJavaProgram();
        displayDifferentStatement();
        displayANumber();
        concatenateTwoDifferentStatements();
        performCalculationOfAnyTwoNumbers();
        concatenateAStringStatementAndANumber();
        concatenateAStringStatementAndPerformCalculationOfAnyTwoNumbers();
        displayTheConcatenationOfStringAndInteger();
       

        //Single-Line Comment
    
        /*
         * Multi-Line Comment
         */
    }

    public static void firstJavaProgram() { 
        System.out.println("Hello, World");
    }

    public static void displayDifferentStatement() {
        System.out.println("Hello");
        System.out.println("World");
    }

    public static void displayANumber() {
        System.out.println(15);
    }

    public static void concatenateTwoDifferentStatements() {
        System.out.println("Hello " + "World");
    }

    public static void performCalculationOfAnyTwoNumbers() {
        System.out.println(2+5);
    }

    public static void concatenateAStringStatementAndANumber() {
        System.out.println("I'm Li Qing, and I'm " + 23);
    }

    public static void concatenateAStringStatementAndPerformCalculationOfAnyTwoNumbers() {
        System.out.println("I'm Li Qing and I'm " + (2023-2000));
    }

    public static void variableDeclaration() {
        String variableOne; //Declaration without value
        int numberOne, numberTwo; //Declaration various variables of the same type
        int numberThree = 25; //Declaration with value
    }

    public static void declareAStringTypeVariable() {
        String variableOne;
    }

    public static void declareTwoIntegerTypeVariables() {
        int numberFour, numberFive;
    }

    public static void displayTheConcatenationOfStringAndInteger() {
        //3
        String welcome = "Welcome to Java Programming ";
        int acc = 1;
        System.out.println(welcome + acc);

        //4
        System.out.println(welcome + (acc += 2));

        //5
        String sumValue = "The sum of 2 values is ";
        System.out.println(sumValue + (acc +=2));


    }

    
}
