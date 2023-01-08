package week09_11_05_2022;

public class önemli__Task6_FrontBack {

    /*
    Task 5: Write a method that return a new string where the first and last chars have been exchanged.


             frontBack("code") → "eodc"
             frontBack("a") → "a"
             frontBack("ab") → "ba"
     */

    public static void main(String[] args) {
        String result=   frontBack("a");
        System.out.println("result = " + result);
    }

    public static String frontBack(String str) {

        if (str.length()==1){
            return str;
        }else {

            String result = "";
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            String middle = str.substring(1, str.length() - 1);

            result = last + middle + first;
            return result;
        }

    }
}
