package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3_GetUniqueElements {
    /*
Task 3 :
Create a method that get two arrays as a parameters then return the arraylist which has contains unique elements in it.
first array :1,2,3,4,5
second array :4,5,6
output:
1,2,3,4,5,6
 */


    public static void main(String[] args) {

        int[] first = {1, 2, 3, 4, 5,5,5};
        int[] second = {4, 5, 6};

        ArrayList<Integer> result= getUniqueElements(first,second);

        System.out.println(result);

    }

    private static ArrayList<Integer> getUniqueElements(int[] first, int[] second) {
      //  ArrayList<Integer> result = new ArrayList<>(Arrays.asList(first,second));

        ArrayList<Integer> result = new ArrayList<>();

        for (int i : first) {
            if (!result.contains(i))
        result.add(i);
        }

        for (int i : second) {
            if (!result.contains(i))// I am cheking my each element from second then I am putitng in my result if it
                result.add(i);
        }
        return result;
    }
}
