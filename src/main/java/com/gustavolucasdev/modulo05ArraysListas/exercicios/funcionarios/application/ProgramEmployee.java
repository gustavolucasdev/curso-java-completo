package com.gustavolucasdev.modulo05ArraysListas.exercicios.funcionarios.application;

import com.gustavolucasdev.modulo05ArraysListas.exercicios.funcionarios.entities.Employee;

import java.util.*;

public class ProgramEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        long id = 0;
        int qntEmployees = 0;
        double salary = 0.0;
        String name;

        System.out.print("How many employees will be registered? ");
        qntEmployees = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        //Logica para salvar os dados na lista
        System.out.println(" ");
        sc.nextLine();
        for (int i = 1; i <= qntEmployees; i++) {
            System.out.println("Employee #" + i + ": ");
            System.out.print("Id: ");
            id = sc.nextLong();
            sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Salary: ");
            salary = sc.nextDouble();
            Employee employeeData = new Employee(id, name, salary);
            list.add(employeeData);
            System.out.println(" ");
        }

        //Lógica para fazer o calculo do aumento de salario
        sc.nextLine();
        System.out.print("Enter the employee id that will have salary increase: ");
        long idEnter = sc.nextLong();

        Employee employee = null;

        for (Employee e : list) {
            if (e.getId() == idEnter) {
                employee = e;
                break;
            }
        }

        if (employee != null) {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();

            double increase = employee.getSalary() * percentage / 100;
            employee.setSalary(employee.getSalary() + increase);

        } else {
            System.out.println("This id does not exist!");
        }

        //Mostrando os dados
        System.out.println(" ");
        System.out.println("List of employees: ");
        for (Employee e : list) {
            System.out.println(e.getId() + ", " + e.getName() + ", " + e.getSalary());
        }
        sc.close();
    }
}
