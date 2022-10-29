import javax.swing.*;

public class Lekcja3 {

    public static void main(String[] args) {

        //System.out.println(even(17));
        //divi(1);
        //System.out.println(ret21(-6, -15));
        //System.out.println(asc(2, 3, 8, true));
        //System.out.println(withoutDoubles(6, 6, true));
        //cigarParty();
        //squirrelPlay();
        //sortaSum;
        //alarmClock();
    }

    public static boolean even(int num) {
        return num % 2 == 0;
    }

    public static void divi(int nume) {
        if (nume % 9 == 0)
            System.out.println(nume + " is divisible by 9");
        if (nume % 4 == 0)
            System.out.println(nume + " is divisible by 4");
        if (nume % 5 == 0)
            System.out.println(nume + " is divisible by 5");
        if (nume % 3 == 0)
            System.out.println(nume + " is divisible by 3");
        if (
                nume % 9 != 0 &&
                        nume % 5 != 0 &&
                        nume % 4 != 0 &&
                        nume % 3 != 0
        )
            System.out.println(nume + " is not divisible by 3/4/5/9");
    }

    public static boolean ret21(int a, int b) {
        return a == 21 || b == 21 || a + b == 21 || Math.abs(a - b) == 21;
    }

    public static boolean asc(int a, int b, int c, boolean eqAll) {
        return (eqAll && a <= b && b <= c) || (a < b && b < c);
    }

    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (die1 > 6 || die1 < 1 || die2 > 6 || die2 < 1)
            return 0;
        else if (noDoubles && die2 == die1 && die1 == 6)
            return (die1 + 1);
        else if (noDoubles && die2 == die1 && die1 != 6)
            return (die1 + die2 + 1);
        else
            return (die1 + die2);

    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        return (cigars >= 40 && isWeekend) || ((cigars >= 40 && cigars <= 60));

    }

    public static int dateFashion(int you, int date) {

        if ((date >= 8 && you > 2) || (date > 2 && you >= 8))
            return 2;
        else if (date > 2 && you > 2)
            return 1;
        else
            return 0;


    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        return (temp >= 60 && temp <= 90) || (isSummer && temp >= 60 && temp <= 100);


    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday)
            speed = speed - 5;
        if (speed <= 60)
            return 0;
        else if (speed >= 61 && speed <= 80)
            return 1;
        else
            return 2;


    }

    public static int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 19)
            return 20;
        else
            return a + b;

    }

    public static String alarmClock(int day, boolean vacation) {
        if ((vacation && day >= 1 && day < 6) || (vacation == false && (day == 6 || day == 0)))
            return "10:00";
        else if (day < 6 && day >= 1)
            return "7:00";
        else
            return "off";


    }

    public static boolean love6(int a, int b) {
        return (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6);


    }

    public static boolean in1To10(int n, boolean outsideMode) {
        return (n <= 10 && n >= 1 && !outsideMode) || ((n >= 10 || n <= 1) && outsideMode);

    }

    public static boolean specialEleven(int n) {
        return (n % 11 == 0 || n % 11 == 1);


    }

    public static boolean makeBricks(int small, int big, int goal) {

        if (goal > (big * 5) + small)
            return false;
        else if (goal % 5 > small)
            return false;
        else
            return true;


    }

    public static int loneSum(int a, int b, int c) {
        if (a + b + c == 3 * a)
            return 0;
        else if ((a + b)==(2 * a))
        return c;
        else if ((b + c)==2 * b)
        return a;
        else if ((a + c)==2 * c)
        return b;
        else
        return a + b + c;
    }
    public static int luckySum(int a, int b, int c){
    if (a==13)
        return 0;
    else if (b==13)
        return a;
    else if (c==13)
    return a+b;
    else
        return a+b+c;
    }
   
}




