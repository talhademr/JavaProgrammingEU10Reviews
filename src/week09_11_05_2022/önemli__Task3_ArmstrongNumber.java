package week09_11_05_2022;

public class önemli__Task3_ArmstrongNumber {


    /*
    Task 2 :   Write a method that can check if a number is Armstrong number

				Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.

				Armstrong numbers are     === 153 370 371 407 === for 3 digits
     */

    public static void main(String[] args) {

        boolean result = isArmstrongNumber(370);
        System.out.println("result = " + result);

    }

    public static boolean isArmstrongNumber(int number) {

        int first = getFirstDigit(number); //1
        int second = getSecondDigit(number); //5
        int third = getThirdDigit(number); //3

        int result=first*first*first +second*second*second+third*third*third;
        if (result==number)
            return true;
        else
            return false;




    }

    private static int getThirdDigit(int number) {
        //153
        return number%10; // if your number is 25 it will give the las digit always //5
    }


    private static int getSecondDigit(int number) {
        //153
        //15               //5
        return number/10    %     10;
    }

    private static int getFirstDigit(int number) {
        // 153/100=1
        return number/100;
    }


}