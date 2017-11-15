import java.util.regex.Pattern;

public class Excercises {

    public static String missingChar(String str, int n) {

         String[] temp = str.split("");

         str = "";

         for (int i=0; i<temp.length; i++) {
             if (n != i) {
                str = str + temp[i];
             }
         }

       return str;

    }


    public static String frontBack(String str) {

        String newStr = Character.toString(str.charAt(str.length()-1));

        if (str.length()>1) {
            newStr += str.substring(1, str.length() - 1);
            newStr += Character.toString(str.charAt(0));
        }

        return newStr;

    }

    public static String front3(String str) {

        if (str.length()<4) {
            str = str + str + str;
            return str;
        }

        str = str.substring(0,3);
        str = str + str + str;

        return str;

    }

    public static String backAround(String str) {

        String newStr = Character.toString(str.charAt(str.length()-1));
        newStr += str;
        newStr += Character.toString(str.charAt(str.length()-1));

        return newStr;


    }

    public static boolean or35(int n) {

        return (n % 3 == 0 || n % 5 == 0);

        }

    public static String front22(String str) {

        if (str.length()<3) {
            return str + str + str;
        }

        // String temp = str.substring(0,2);

        String temp = str.substring(0,3);

        return temp + str + temp;

    }

    public static boolean startHi(String str) {

        if (str.length()<2) {
            return false;
        }

        return str.substring(0,2).equals("hi");

    }

    public static boolean icyHot(int temp1, int temp2) {

        return (temp1>100 && temp2<0) || (temp1<0 && temp2 >100);

    }

    public boolean in1020(int a, int b) {

        return (a>= 10 && a<=20) || (b>= 10 && b<=20);

    }

    public boolean hasTeen(int a, int b, int c) {

        return (a >= 13 && a<= 19) || (b >= 13 && b<= 19) || (c >= 13 && c<= 19);
    }

    public static String delDel(String str) {

        if (str.contains("del") == true && str.indexOf("del")==1) {

            String beg = str.substring(0,str.indexOf("del"));
            String end = str.substring(str.indexOf("del")+3,str.length());
            return beg + end;
        };

        return str;
    }

    public boolean loneTeen(int a, int b) {

        return ((a >= 13 && a<= 19) && (b < 13 || b> 19)) || ((b >= 13 && b<= 19) && (a < 13 || a> 19));

    }

    public static boolean mixStart(String str) {

        return str.matches("^.ix.*");
    }

    public static String startOz(String str) {

        String newString ="";

        if (str.length()>=1) {
            if (str.charAt(0) == 'o') newString = Character.toString(str.charAt(0));
        }

        if (str.length()>=2) {
            if (str.charAt(1) == 'z') newString = newString + Character.toString(str.charAt(1));
        }

        return newString;

    }

    public int intMax(int a, int b, int c) {

        int max = a;

        if (b>a) {
            max = b;
        }

        if (c>max) max =c;

        return max;
    }

    public int close10(int a, int b) {

        if (Math.abs(10-b) == Math.abs(10 -a)) return 0;
        if (Math.abs(10-b) < Math.abs(10 -a)) return b;
        else return a;

    }

    public static boolean in3050(int a, int b) {

        return ((a >=40 && a <=50) && (b >=40 && b <=50)) || ((a >=30 && a<=40) && (b >=30 && b<=40));

    }

    private int max1020(int a, int b) {

        int max = 0;

        if (a >= 10 && a <= 20 ) {
            max = a;
        }
        if ((b >= 10 && b <= 20) && b > max) {
            max = b;
        }

        return max;
    }


    public boolean stringE(String str) {

        int counter = 0;

        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == 'e') counter++;
        }
            return counter >=1 && counter <=3;
    }

    public boolean lastDigit(int a, int b) {

        return a % 10 == b % 10;
    }

    public static String endUp(String str) {

        if (str.length()<=3) return str.toUpperCase();

        String sub = str.substring(str.length()-3,str.length());
        String beg = str.substring(0,str.length()-3);

        return beg + sub.toUpperCase();

    }

    public static String everyNth(String str, int n) {

        String[] word = str.split("");
        str = word[0];
        for (int i=1; i<word.length;i++) {
            if (i % n == 0) {
                str += word[i];
            }
        }
        return str;
    }

    public String stringTimes(String str, int n) {

        String string = "";

        for (int i=1; i<=n; i++) {
            string = string + str;
        }

        return string;
    }


    public static String test (String str, int n) {

        String string = "";

        if (str.length() < 3) {
            str = str.substring(0,str.length());
        } else {
            str = str.substring(0,3);
        }

        for (int i=1; i<= n; i++) {
            string = string + str;
    }

        return string;
    }

    static int countXX(String str) {

        int counter = 0;
        str = str.toUpperCase();
        String word[] = str.split("");
        for (int i=0; i<=word.length-2;i++) {
            if (word[i].equals("X") && word[i+1].equals("X")) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {

       // System.out.println(missingChar("kitten", 4));

        //System.out.println(frontBack("ab"));

        //System.out.println(front3("kot"));

        //System.out.println(backAround("kot"));

        //System.out.println(or35(8));

        //System.out.println(front22("a"));

        //System.out.println(startHi("hello hi"));

        //System.out.println(delDel("aHellodel"));

        //System.out.println(mixStart("9ix snax"));

        //System.out.println(startOz("o"));

        //System.out.println(in3050(40,51));

       // System.out.println(endUp("Baba Jaga"));

       // System.out.println(everyNth("Miracle",2));

        //System.out.println(test("ma",2));

        System.out.println(countXX("abcxx"));
    }

}
