package ru.geekbrains.Java_Level1.lesson5;

public class Main {

    public static void main(String[] args) {

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Иванов И.И.", "рабочий1", "www.com.com",
                123, 10000, 15);
        empArray[1] = new Employee("Петров И.И.", "рабочий2", "www.com.com",
                234, 12000, 25);
        empArray[2] = new Employee("Сидоров И.И.", "рабочий3", "www.com.com",
                345, 15000, 45);
        empArray[3] = new Employee("Ветров И.И.", "рабочий4", "www.com.com",
                456, 12000, 55);
        empArray[4] = new Employee("Камнев И.И.", "рабочий5", "www.com.com",
                678, 10000, 70);

        for (int i = 0; i<empArray.length; i++){
            if(empArray[i].getAge()>40){
                empArray[i].getEmployee();
            }
        }

        for (Employee emp : empArray){
            if (emp.getAge() > 40){
                emp.getEmployee();
            }
        }


    }
}
