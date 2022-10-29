import com.sun.jdi.IntegerValue;

import java.lang.reflect.Array;
import java.util.Scanner;


public class Lekcja5 {


    public static void main(String[] args) {
        //System.out.println(noTeenSum(12, 15, 18));
        // currencyExchange(0,"");
//printNumbers();
        //System.out.println(sumNumbers());
        //numScanner();
//fibonacci();
        //printVertically("Sicko mode");
        //printVerticallyBackwards("Sicko mode");
        //System.out.println(palindrome("kajak"));
       // int[] ints = {1, 18, 32, 5435, 12, 1};
        //System.out.println(getMax(ints));
        String[] a = {"lol","kek","heh"};
        String[] b = {"what","dafuq"};

        String[] concat = concat(a,b);
        for (int i = 0; i<concat.length;i++){
            System.out.println(concat[i]);
        }


    }


    public static int noTeenSum(int a, int b, int c) {
        int sum = 0;
        sum += fixTeen(a);
        sum += fixTeen(b);
        sum += fixTeen(c);
        return sum;
    }

    public static int fixTeen(int n) {
        if (n == 13 || n == 14 || n == 17 || n == 18 || n == 19) {
            return 0;

        } else
            return n;
    }

    public int roundSum(int a, int b, int c) {
        int sum = 0;
        sum += round10(a);
        sum += round10(b);
        sum += round10(c);
        return sum;
    }

    public int round10(int num) {
        if ((num % 10) > 4)
            num = num + (10 - (num % 10));
        else
            num = num - (num % 10);
        return num;
    }

    public boolean closeFar(int a, int b, int c) {
        return (((Math.abs(a - b) <= 1) || (Math.abs(a - c) <= 1)) && (((Math.abs(a - b) >= 2) && ((Math.abs(b - c)) >= 2)) || ((Math.abs(a - c) >= 2) && (Math.abs(b - c) >= 2))));
    }

    public int blackjack(int a, int b) {
        if ((a == 21) || (b == 21))
            return 21;
        else if ((a <= 21) && ((a % 21) >= (b % 21)))
            return a;
        else if (b <= 21)
            return b;
        else
            return 0;
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        int sum = a + b + c;
        return (sum == 3 * a || sum == 3 * b || sum == 3 * c);
    }

    public static int makeChocolate(int small, int big, int goal) {
        if ((small + (5 * big) < goal) || (goal % 5 > small))
            return -1;
        else if (goal >= 5 * big)
            return goal - 5 * big;
        else if (goal <= 5 * big)
            return goal % 5;
        else
            return -1;
    }

    public static void currencyExchange(double money, String currency) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money in PLN?:");
        money = scanner.nextInt();
        System.out.println("What currency?:");
        currency = scanner.next().toLowerCase();
        switch (currency) {
            case "usd" -> System.out.println(money / 4.19 + currency.toUpperCase());
            case "gbp" -> System.out.println(money / 5.18 + currency.toUpperCase());
            case "eur" -> System.out.println(money / 4.54 + currency.toUpperCase());
            case "chf" -> System.out.println(money / 4.31 + currency.toUpperCase());
            default ->
                    System.out.println("Error! Following currency : " + currency.toUpperCase() + " is not available.");
        }
    }

    public static void printNumbers() {
        // for (int i = 1; i<10;i++)
        //     System.out.println(i);
        int y = 0;
        while (y < 10) {
            ++y;
            System.out.println(y);
        }
    }

    public static int sumNumbers() {
        int y = 0;
        int sum = 0;
        while (y < 50) {
            y++;
            sum += y;
        }
        return sum;
    }

    public static void numScanner() {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        int sum = 0;

        while (!"stop".equals(input)) {
            System.out.println("Next number");
            input = scanner.next();
            if ("stop".equals(input))
                break;
            int i = Integer.parseInt(input);
            sum += i;
        }
        System.out.println("Your sum is : " + sum);
    }

    public static void fibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many fibonacci numbers to print?");
        int howManyNumbers = scanner.nextInt();
        System.out.println("Sure thing :)");
        int current = 0;
        int next = 1;
        int placeHolder = 0;
        int whichNumber = 0;
        while (whichNumber < howManyNumbers) {
            System.out.println(current);
            placeHolder = next;
            next = current + next;
            current = placeHolder;
            whichNumber++;
        }
        System.out.println("Done!");
    }

    public static void printVertically(String s) {
        int howLong = s.length();
        for (int i = 0; i < howLong; i++) {
            System.out.println(s.charAt(i));
        }
    }

    public static void printVerticallyBackwards(String s) {
        int howLong = s.length();
        for (int i = 0; i < howLong; i++) {
            System.out.println(s.charAt(howLong - i - 1));
        }
    }

    public static boolean palindrome(String s) {
        String word = "";
        int howLong = s.length();
        for (int i = 0; i < howLong; i++) {
            word += s.charAt(howLong - i - 1);
        }
        return word.equals(s);
    }

    public static int getMax(int[] array) {
        int maxSoFar = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= maxSoFar)
                maxSoFar = array[i];
        }
        return maxSoFar;
    }

    public static String[] concat(String[] a, String[] b) {
int o = a.length+b.length;
        String[] c = new String[o];
        int i1 = 0;
        for (i1 = 0;i1<a.length;i1++){
            c[i1]=a[i1];
        }
        for (int i = i1; i < b.length+i1; i++) {
        c[i] = b[i-i1];
        }
        return c;
    }


}
