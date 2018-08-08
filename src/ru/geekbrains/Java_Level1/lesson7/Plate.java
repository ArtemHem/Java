package ru.geekbrains.Java_Level1.lesson7;

public class Plate {
    private int amtFood;

    Plate(int amtFood){
        this.amtFood = amtFood;
    }

    int getAmtFood(){
        return amtFood;
    }

    void setAmtFood(int foodServing){
        if ((amtFood - foodServing) >= 0) amtFood -= foodServing;
    }

    void addFood(int amount){
        if (amount >= 0){
            amtFood += amount;
            return;
        }
        System.out.println("Нельзя добавить отрицательное значение еды.");
    }

    void plateInfo(){
        System.out.println("Количество еды в тарелке: " + amtFood);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plate plate = (Plate) o;
        return amtFood == plate.amtFood;
    }
}
