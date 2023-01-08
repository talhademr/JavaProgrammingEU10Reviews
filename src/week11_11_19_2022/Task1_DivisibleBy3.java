package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1_DivisibleBy3 {
    /*
    Task 1 :
Create a method that which is get arraylist as a parameter then return the numbers which are divisible by 3.
input:
  numbers : 2,3,4,5,6,8,9
output:
3,6,9
     */

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2,3,4,5,6,8,9));

        ArrayList<Integer> result = divisibleBy3(numbers);
        System.out.println(result);


    }

    private static ArrayList<Integer> divisibleBy3(ArrayList<Integer> numbers) {
        //removeIf()

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer number : numbers){
            if (number%3==0)
                result.add(number);
        }

        return result;

    }
}
