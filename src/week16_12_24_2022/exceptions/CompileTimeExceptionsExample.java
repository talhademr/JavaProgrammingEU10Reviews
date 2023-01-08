package week16_12_24_2022.exceptions;

public class CompileTimeExceptionsExample {
    public static void main(String[] args) {

        System.out.println("Adam");
        waitFor(3);
        System.out.println("Ersin");
        //    Thread.sleep(3000);

    }

    private static void waitFor(int i) {
        try {
            Thread.sleep(i*1000);
        } catch (InterruptedException e) {

        }
    }


}

