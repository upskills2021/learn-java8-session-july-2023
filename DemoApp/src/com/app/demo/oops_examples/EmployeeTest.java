package com.app.demo.oops_examples;

import java.math.BigDecimal;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1L, "TestEmp01");
        BigDecimal basicSalaryEmp1 = BigDecimal.valueOf(1000);
        BigDecimal daEmp1 = BigDecimal.valueOf(3000);
        BigDecimal hraEmp1 = BigDecimal.valueOf(5000);
        BigDecimal variableComponentEmp1 = BigDecimal.valueOf(6000);
        SalaryComponent salaryComponentEmployee1 = new SalaryComponent(basicSalaryEmp1, daEmp1, hraEmp1, variableComponentEmp1);
        employee1.setSalary(salaryComponentEmployee1);
        System.out.println(employee1);

        Employee employee2 = new Employee(1L, "TestEmp02");
        BigDecimal basicSalaryEmp2 = BigDecimal.valueOf(1100);
        BigDecimal daEmp2 = BigDecimal.valueOf(4000);
        BigDecimal hraEmp2 = BigDecimal.valueOf(6000);
        BigDecimal variableComponentEmp2 = BigDecimal.valueOf(7000);
        SalaryComponent salaryComponentEmployee2 = new SalaryComponent(basicSalaryEmp2, daEmp2, hraEmp2, variableComponentEmp2);
        employee2.setSalary(salaryComponentEmployee2);
        System.out.println(employee2);

        double salaryEmp1 = EmployeeSalaryCalculator.calculateSalary(employee1.getSalary()).doubleValue();
        double salaryEmp2= EmployeeSalaryCalculator.calculateSalary(employee2.getSalary()).doubleValue();

        System.out.println("Salary of Emp1 :: " + salaryEmp1);
        System.out.println("Salary of Emp2 :: " + salaryEmp2);
    }
}
