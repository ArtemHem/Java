package ru.geekbrains.Java_Level1.lesson7;

public class Cat {
    private String name;
    private boolean notHungry = false;
    private int foodServing;

    Cat(String name, int foodServing) {
        this.name = name;
        this.foodServing = foodServing;
    }

    void eatFood(Plate p) {
        int x = p.getAmtFood();
        if (x >= foodServing) {
            p.setAmtFood(foodServing);
            notHungry = true;
            return;
        }
        notHungry = false;
    }

    void catInfo() {
        System.out.println("Имя: " + name + " Сыт: " + notHungry);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", notHungry=" + notHungry +
                ", foodServing=" + foodServing +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if (o == null) return false;
        if(!(o instanceof Cat)) return false;

        Cat cat = (Cat) o;
        if(notHungry != cat.notHungry) return false;
        if(foodServing!=cat.foodServing) return false;
        if (!(name.equals(cat.name)) || name == null || cat.name == null) return false;
        return true;
    }

}
