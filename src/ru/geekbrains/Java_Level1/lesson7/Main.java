package ru.geekbrains.Java_Level1.lesson7;

import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {

        Plate plate = new Plate(40);
        Cat[] cat = new Cat[4];

        cat[0] = new Cat("Снежок", 10);
        cat[1] = new Cat("Пушок", 15);
        cat[2] = new Cat("Пушок", 15);
        cat[3] = new Cat("Рыжик", 20);

        for (int x=0; x<2;x++) {
            for (Cat i : cat) {

                i.eatFood(plate);
                i.catInfo();
            }
            plate.plateInfo();
            plate.addFood(100);
        }

        System.out.println(cat[1].equals(cat[1]));
        System.out.println(cat[1].equals(cat[2]));
        System.out.println(cat[0].toString());
    }


}
