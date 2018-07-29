package ru.geekbrains.Java_Level1.lesson5;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private int tel;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, int tel, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    void getEmployee(){
        System.out.println("ФИО: " + fullName + "; должность: " + position + "; email: " +
        email + "; телефон: " + tel + "; зарплата: " + salary + "; возраст: " + age);
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public int getTel() {
        return tel;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
