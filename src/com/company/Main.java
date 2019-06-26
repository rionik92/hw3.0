package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String names[] = {"Иван", "Олег", "Антон"};
        names = Arrays.copyOf(names, names.length + 1);
        names[3]="Саша";
        for (int i = 0; i < names.length; i++){
            switch (i) {
                case 0:
                    System.out.println(names[i] + " доброго утра");
                    break;
                case 1:
                    System.out.println(names[i] + " доброго дня");
                    break;
                case 2:
                    System.out.println(names[i] + " доброго вечера");
                    break;
                case 3:
                    System.out.println(names[i] + " доброй ночи");
                    break;


            }


        }

    }
}
