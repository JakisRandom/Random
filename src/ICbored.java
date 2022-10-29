import com.sun.jdi.CharValue;

public class ICbored {
    public static void main(String[] args) {
        //   System.out.println(doubleChar("AABB"));
        //  System.out.println(countHi("hihellohi"));
        // System.out.println(catDog("catdogCatdog"));
        // System.out.println(endOther("nonabc", "abc"));

        //System.out.println(contains("lakamakafo","jjk"));
    }

    public static String doubleChar(String str) {
        int i = str.length();
        String output = "";
        for (int c = 0; c < i; c++) {
            output += str.charAt(c);
            output += str.charAt(c);

        }
        return output;
    }

    public static int countHi(String str) {
        int hiCount = 0;
        int length = str.length();
        String h1 = "hi";
        char h = h1.charAt(0);
        char hi = h1.charAt(1);
        for (int i = 0; i < length - 1; i++) {
            if (str.toLowerCase().charAt(i) == h && str.toLowerCase().charAt(i + 1) == hi)
                hiCount++;

        }
        return hiCount;

    }

    public static boolean catDog(String str) {
        int catNum = 0;
        int dogNum = 0;
        int length = str.length() - 2;
        for (int i = 0; i < length; i++) {
            String cat = "cat";
            String dog = "dog";
            char cat1 = cat.charAt(0);
            char cat2 = cat.charAt(1);
            char cat3 = cat.charAt(2);
            char dog1 = dog.charAt(0);
            char dog2 = dog.charAt(1);
            char dog3 = dog.charAt(2);
            if (str.toLowerCase().charAt(i) == cat1 && str.toLowerCase().charAt(i + 1) == cat2 && str.toLowerCase().charAt(i + 2) == cat3)
                catNum++;
            if (str.toLowerCase().charAt(i) == dog1 && str.toLowerCase().charAt(i + 1) == dog2 && str.toLowerCase().charAt(i + 2) == dog3)
                dogNum++;


        }
        return catNum == dogNum;

    }

    public static int countCode(String str, String seek) {
        int codeNum = 0;
        int length = str.length() - 3;
        char table[] = str.toCharArray();
        for (int i = 0; i < length; i++) {
            char code0 = 'c';
            char code1 = 'o';
            char code3 = 'e';

            if (str.charAt(i) == code0 && str.charAt(i + 1) == code1 && str.charAt(i + 3) == code3)
                codeNum++;
        }
        return codeNum;
    }

    public static boolean endOther(String a, String b) {
     if (a.endsWith(b))
         return true;
     else if (b.endsWith(a))
         return true;
     else
         return false;

    }

    public static int contains(String input, String sought) {
        char aArray[] = input.toLowerCase().toCharArray();
        char bArray[] = sought.toLowerCase().toCharArray();
        int bCount = 0;
        int fullCount = 0;

        for (int i1 = 0; i1 <= input.length() - sought.length(); i1++) {
            for (int i2 = 0; i2 < sought.length(); i2++) {
                if (aArray[i1+i2]!=bArray[i2]) {
                    break;
                }
                else if (i2 == sought.length())
                    fullCount++;

                }
            }
        return fullCount;

        }
    }





