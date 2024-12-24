package com.maslyak.practicRest.entity;

public class Cat {
    private String name;
    private int age;
    private int weight;

    // Конструктор с параметрами
    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Пустой конструктор (нужен для работы Jackson при десериализации)
    public Cat() {
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
