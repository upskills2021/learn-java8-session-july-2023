package com.app.demo.oops_examples;

import java.math.BigDecimal;

public class EmployeeSalaryCalculator {
    private EmployeeSalaryCalculator() {
        //private constuctor is used to prevent instantiation
    }

    public static BigDecimal calculateSalary(SalaryComponent salaryComponent) {
        return salaryComponent.getBasic()
                .add(salaryComponent.getDa())
                .add(salaryComponent.getHra())
                .add(salaryComponent.getVariableAllowance())
                .subtract(BigDecimal.valueOf(1000))
                .subtract(BigDecimal.valueOf(500));
    }
}
