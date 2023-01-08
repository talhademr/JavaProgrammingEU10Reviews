package week07_10_22_2022;

import java.util.Random;
import java.util.Scanner;

public class T1_FindingHiddenNumbers {

    public static void main(String[] args) {

        /*
 -- Task 1: Find the number taht given a hidden number between 1 and 100 randomly created.
 Hint:   Random random=new Random();
        int hiddenNumber = random.nextInt(100) + 1;
        */

        Random random = new Random();

        int hiddenNumber = random.nextInt(10) +1;

        Scanner scan = new Scanner(System.in);
        boolean flag = true;

        do {
            System.out.println("Enter an number");
            int searchingNumber = scan.nextInt();
            if (searchingNumber==hiddenNumber){
                System.out.println("you find number Congrats!");
                flag=false;

            }else{
                System.out.println("try again");
            }
        }while (flag);



    }
}
