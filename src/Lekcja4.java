import java.util.Scanner;

public class Lekcja4 {
//case
// switch
// yield
// default
//
//

    public static void main(String[] args) {
        //guzik(2);
        //season("october");
        //System.out.println(returnGrade(2));
        //startQuiz();
        //printNumber();
        //System.out.println(sumOf50());
        printFibonacci(33);
       // System.out.println("Your sum = " + sum5Numbers());
    }

    public static void guzik(int i) {
        switch (i) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            case 3 -> System.out.println("three");
            default -> System.out.println("nope");
        }
    }

    public static void season(String wMonth) {
        switch (wMonth.toLowerCase()) {
            case "january", "february", "december" -> System.out.println("Winter");

            case "march", "april", "may" -> System.out.println("Spring");

            case "june", "july", "august" -> System.out.println("Summer");

            case "september", "october", "november" -> System.out.println("Autumn");
            default -> System.out.println("Not a month");

        }
    }

    public static String returnGrade(int grade) {
        return switch (grade) {
            case 1 -> "bad";
            case 2 -> "not bad";
            case 3 -> "ok";
            case 4 -> "good";
            case 5 -> "excellent";
            default -> null;
        };

    }

    public static void startQuiz() {
        int score = 1;
        Scanner scanner = new Scanner(System.in);

        //Question 1
        System.out.println("Which ..das");
        System.out.println("a.c is right ");
        System.out.println("b.c is right ");
        System.out.println("c. c is right ");
        System.out.println("d. c is right ");
        System.out.println();
        System.out.println("Enter your choice");

        String answer = scanner.next();

        switch (answer) {
            case "a", "b", "d" -> System.out.println("Incorrect");
            case "c" -> {
                System.out.println("Correct!");
                score++;
            }
            default -> System.out.println("Answer not available");
        }
        //Question 2
        System.out.println("Which ..das");
        System.out.println("a.b is right ");
        System.out.println("b.b is right ");
        System.out.println("c.b is right ");
        System.out.println("d.b is right ");
        System.out.println();
        System.out.println("Enter your choice");

        answer = scanner.next();
        switch (answer) {
            case "a", "c", "d" -> System.out.println("Incorrect");
            case "b" -> {
                System.out.println("Correct!");
                score++;
            }
            default -> System.out.println("Answer not available");

        }
        //Question 3
        System.out.println("Which ..das");
        System.out.println("a.d is right");
        System.out.println("b.d is right");
        System.out.println("c.d is right");
        System.out.println("d.d is right");
        System.out.println();
        System.out.println("Enter your choice");
        answer = scanner.next();
        switch (answer) {
            case "a", "c", "b" -> System.out.println("Incorrect");
            case "d" -> {
                System.out.println("Correct!");
                score++;
            }
            default -> {
                System.out.println("Answer not available");
            }
        }
        System.out.println("Which ..das");
        System.out.println("a.b is right ");
        System.out.println("b.b is right ");
        System.out.println("c.b is right ");
        System.out.println("d.b is right ");
        System.out.println();
        System.out.println("Enter your choice");

        answer = scanner.next();
        switch (answer) {
            case "a", "c", "d" -> System.out.println("Incorrect");
            case "b" -> {
                System.out.println("Correct!");
                score++;
            }
            default -> System.out.println("Answer not available");
        }


        System.out.println("Your score is " + returnGrade(score) + "!");
    }

    public static void printNumber() {
        for (int i = 2; i < 11; i = i + 2)
            System.out.println(i);
    }

    public static int sumOf50() {
        int sum = 0;
        for (int i = 1; i <= 50; i++)
            sum += i;
        return sum;
    }

    public static void printFibonacci(int howManyPositions) {
        int previousNumber = 0;
        int currentNumber = 1;
        int placeHolder = 0;
        int whichPosition = 0;
        for (previousNumber = 0; whichPosition < howManyPositions; previousNumber = previousNumber + currentNumber, whichPosition++) {
            System.out.println(previousNumber);
            placeHolder = currentNumber;
            currentNumber = previousNumber;
            previousNumber = placeHolder;
        }
    }

    public static int sum5Numbers() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        for (i = 0; i < 5; sum += scanner.nextInt(), i++)
            System.out.println("Next value: ");
        return sum;


    }
}

