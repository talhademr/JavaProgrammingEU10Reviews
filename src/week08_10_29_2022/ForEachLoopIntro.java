package week08_10_29_2022;

import java.util.Arrays;

public class ForEachLoopIntro {

    public static void main(String[] args) {

int [] numbers = {1,2,3,5,4};

        for (int each :numbers) {
            System.out.println(each);
        }

        //toCharArray()

        String str = "Adam";
        char [] letters = str.toCharArray();
        for (char letter : letters) {
            System.out.println(letter);
        }
        System.out.println(Arrays.toString(letters));


        System.out.println("----------------");

        String str1 = "Talha DEMİR";

        char [] chars = str1.toCharArray();
        System.out.println(Arrays.toString(chars));

        //split(regex)

        String sentence="Java   is a good language.";
        String [] words = sentence.split(" ");
        for (String word : words)
            System.out.println(word);
        }

    }

