package com.gustavolucasdev.modulo05ArraysListas.exercicios.funcionarios.entities;

public class Employee {
    private Long id;
    private String name;
    private Double salary;
    private Double percentage;

    public Employee() {
    }

    public Employee(Long id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Long getId() {
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

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public Double increaseSalary(Double salary, Double percentage) {
        return (salary * percentage / 100) + salary;
    }
}
