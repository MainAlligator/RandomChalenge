package com.company;

import java.util.Random;


public class Main {


    public static void main(String[] args) {

        Random newRandom = new Random();
        int randomOne = newRandom.nextInt(6) + 1;
        System.out.println(randomOne);

        switch (randomOne) {

            case 1:
                System.out.println("Передвинтесь на один шаг вперед - это нечетное число");
                break;
            case 2:
                System.out.println("Передвинтесь на два шага вперед - это четное число");
                break;
            case 3:
                System.out.println("Передвинтесь на три шага вперед - это нечетное число");
                break;
            case 4:
                System.out.println("Передвинтесь на четыре шага вперед - это четное число");
                break;
            case 5:
                System.out.println("Передвинтесь на пять шагов вперед - это нечетное число");
                break;
            case 6:
                System.out.println("Передвинтесь на шесть шагов вперед - это четное число");
                break;


        }
        boolean randomNext = isEvenNumber(randomOne);
        String descriptionRandom = isEvenNumber(randomNext);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;

    }

    public static String isEvenNumber(boolean number) {

        System.out.println(number ? "Это четное число" : "Это нечетное число");

        return "Конец выполнения";
    }

}
