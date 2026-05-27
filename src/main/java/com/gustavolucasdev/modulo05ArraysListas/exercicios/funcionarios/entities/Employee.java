package com.gustavolucasdev.modulo05ArraysListas.exercicios.funcionarios.entities;

public class Employee {
    private long id;
    private String name;
    private Double salary;

    public Employee() {
    }

    public Employee(Long id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
